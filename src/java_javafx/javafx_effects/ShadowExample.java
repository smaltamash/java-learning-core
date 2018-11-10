package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle; 
import javafx.scene.paint.Color;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class ShadowExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    Image img=new Image("https://www.javatpoint.com/images/logo/jtp_logo.png");     
        ImageView imgView=new ImageView(img);
		imgView.setX(100);
		imgView.setY(100);
		Shadow shadow=new Shadow();
		shadow.setBlurType(BlurType.GAUSSIAN);
		shadow.setColor(Color.BLACK);
		shadow.setHeight(30);
		shadow.setRadius(12);
		shadow.setWidth(20);
		imgView.setEffect(shadow);
		Group root=new Group();
		root.getChildren().add(imgView);
		Scene scene=new Scene(root,600,350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shadow Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
