package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle; 
import javafx.scene.paint.Color;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class InnerShadowExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    Image img=new Image("https://www.javatpoint.com/images/logo/jtp_logo.png");     
        ImageView imgView=new ImageView(img);
		imgView.setFitHeight(100);
		imgView.setFitWidth(350);
		imgView.setX(130);
		imgView.setY(125);
		InnerShadow inner=new InnerShadow();
		inner.setBlurType(BlurType.GAUSSIAN);
		inner.setColor(Color.RED);
		inner.setHeight(25);
		inner.setWidth(20);
		inner.setChoke(0.9);
		inner.setRadius(12);
		imgView.setEffect(inner);
		Group root=new Group();
		root.getChildren().add(imgView);
		Scene scene=new Scene(root,600,350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("InnerShadow Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
