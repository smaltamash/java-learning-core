package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle; 
import javafx.scene.paint.Color;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class GlowExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Image img1=new Image("https://www.javatpoint.com/linux/images/linux-first.png");
		Image img2=new Image("https://www.javatpoint.com/linux/images/linux-first.png");
		ImageView imgView1=new ImageView(img1);	
		ImageView imgView2=new ImageView(img2);
		Text text1=new Text();
		Text text2=new Text();
		text1.setText("Glowing with Level 10");
		text2.setText("Not Glowing");
		text1.setX(60);
		text1.setY(300);
		text2.setX(325);
		text2.setY(300);
		text1.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
		text2.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
		text1.setFill(Color.BLACK);
		text2.setFill(Color.BLACK);
		imgView1.setX(70);
		imgView1.setY(90);
		imgView2.setX(300);
		imgView2.setY(90);
		Glow glow=new Glow();
		glow.setLevel(10);
		imgView1.setEffect(glow);
		Group root=new Group();
		root.getChildren().addAll(imgView1,imgView2,text1,text2);
		Scene scene=new Scene(root,500,350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Glow Effect Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
