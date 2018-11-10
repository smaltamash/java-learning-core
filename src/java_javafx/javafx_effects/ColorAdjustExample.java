package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ColorAdjustExample extends Application
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
		text1.setText("ColorAdjust Effect Applied");
		text2.setText("ColorAdjust Effect Not Applied");
		text1.setX(50);
		text1.setY(300);
		text2.setX(355);
		text2.setY(300);
		text1.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
		text2.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
		text1.setFill(Color.RED);
		text2.setFill(Color.RED);
		text1.setStroke(Color.BLACK);
		text2.setStroke(Color.BLACK);
		text1.setStrokeWidth(0.2);
		text2.setStrokeWidth(0.2);
		imgView1.setX(100);
        imgView1.setY(90);
		imgView2.setX(400);
		imgView2.setY(90);
		ColorAdjust c=new ColorAdjust(); //creating the instance of the ColorAdjust Effect.
		c.setBrightness(0.2); //setting the Brightness of the color
		c.setContrast(0.1); //setting the Contrast of the color
		c.setHue(0.3); //setting the Hue of the color
        c.setSaturation(0.45); //setting the Saturation of the color
		imgView1.setEffect(c); //applying effect on the image 	 	 	
		Group root=new Group();
		root.getChildren().addAll(imgView1,imgView2,text1,text2);
		Scene scene=new Scene(root,700,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ColorAdjust Effect Example");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
