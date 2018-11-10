package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class LightDistantExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    Text text=new Text();
	    text.setFont(Font.font(null,FontWeight.BOLD,35));
	    text.setX(60);
	    text.setY(100);
	    text.setText("Welcome to Java World");
	    text.setFill(Color.GREEN) ;
	    Image img=new Image("https://www.javatpoint.com/operating-system/images/operating-system-tutorial.png");     
        ImageView imgView=new ImageView(img);
		imgView.setX(150);
		imgView.setY(200);
		Light.Distant light=new Light.Distant();
		light.setAzimuth(0.2);
		light.setColor(Color.YELLOW);
		Lighting lighting=new Lighting();
		lighting.setLight(light);
		text.setEffect(lighting);
		imgView.setEffect(lighting);
		Group root=new Group(text,imgView);
		Scene scene=new Scene(root,580,420);
		primaryStage.setTitle("Light.Distant Effect Example");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
