package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle; 
import javafx.scene.paint.Color;
import javafx.scene.effect.Bloom;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class BloomExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Rectangle rect1=new Rectangle(60,50,150,200);
		Rectangle rect2=new Rectangle(325,50,150,200);
		rect1.setFill(Color.GREEN);
		rect1.setStroke(Color.BLACK);
		rect1.setStrokeWidth(5);
		rect2.setFill(Color.GREEN);
		rect2.setStroke(Color.BLACK);
		rect2.setStrokeWidth(5);
		Text text1=new Text();
		Text text2=new Text();
		text1.setText("Effected Shape");
		text2.setText("Original Shape");
		text1.setX(65);
		text1.setY(300);
		text2.setX(335);
		text2.setY(300);
		text1.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
		text2.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
		text1.setFill(Color.RED);
		text2.setFill(Color.RED);
		text1.setStroke(Color.BLACK);
		text2.setStroke(Color.BLACK);
		text1.setStrokeWidth(0.2);
		text2.setStrokeWidth(0.2);
		Bloom bloom=new Bloom();
		bloom.setThreshold(0.1);
		rect1.setEffect(bloom);
		Group root=new Group();
		root.getChildren().addAll(rect1,rect2,text1,text2);
		Scene scene=new Scene(root,600,350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bloom Effect Example");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
