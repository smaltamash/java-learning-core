package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.effect.ColorInput;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class ColorInputExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		ColorInput color=new ColorInput(); 
		color.setPaint(Color.RED);
		color.setHeight(100);
		color.setWidth(100);
		color.setX(140);
		color.setY(90);
		Rectangle rect=new Rectangle();
		rect.setEffect(color);
		Group root=new Group();
		root.getChildren().add(rect);
		Scene scene=new Scene(root,400,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ColorInput Effect Example");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
