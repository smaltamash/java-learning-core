package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle; 
import javafx.scene.paint.Color;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class MotionBlurExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Text text=new Text();
		text.setText("Welcome to Java");
		text.setX(30);
		text.setY(100);
		text.setFont(Font.font("Calibri",FontWeight.BOLD,FontPosture.ITALIC,40));
		MotionBlur motion=new MotionBlur();	
		motion.setAngle(20);
		motion.setRadius(10);
		text.setEffect(motion);
		Group root=new Group();
		root.getChildren().add(text);
		Scene scene=new Scene(root,600,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("MotionBlurExample Effect Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
