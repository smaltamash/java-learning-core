package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle; 
import javafx.scene.paint.Color;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class DropShadowExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    Image img=new Image("https://www.javatpoint.com/images/logo/jtp_logo.png");     
        ImageView imgView=new ImageView(img);
		imgView.setX(130);
		imgView.setY(125);
		imgView.setFitWidth(175);
		DropShadow drop=new DropShadow();
		drop.setBlurType(BlurType.GAUSSIAN);
		drop.setColor(Color.BLACK);
		drop.setHeight(100);
		drop.setWidth(20);
		drop.setOffsetX(10);
		drop.setOffsetY(10);
		drop.setSpread(0.2);
		drop.setRadius(10);
		imgView.setEffect(drop);
		Group root=new Group();
		root.getChildren().add(imgView);
		Scene scene=new Scene(root,400,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("DropShadow Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
