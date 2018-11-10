package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class RectangleExample2 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		primaryStage.setTitle("Rectangle Example");
		Group group=new Group(); 
		Rectangle rect=new Rectangle(); 
		rect.setX(20); 
		rect.setY(20); 
        rect.setWidth(100); 
        rect.setHeight(100); 
        rect.setArcHeight(35);
        rect.setArcWidth(35);
        rect.setFill(Color.RED);
        group.getChildren().addAll(rect); 
		Scene scene=new Scene(group,200,300,Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}