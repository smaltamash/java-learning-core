package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class ImageInputExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Image img=new Image("https://www.javatpoint.com/jogl/images/jogl-3d-triangle.gif"); //when you will take image from the internet url it will take more time than when you take image from your harddisk
		ImageInput imgInput=new ImageInput(); 
		Rectangle rect=new Rectangle();
		imgInput.setSource(img);
        imgInput.setX(20);
        imgInput.setY(100);
		Group root=new Group();
		root.setEffect(imgInput);	
		root.getChildren().add(rect);
		Scene scene=new Scene(root,530,500,Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ImageInput Effect Example");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
