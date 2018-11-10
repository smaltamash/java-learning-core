package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class PolygonExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Polygon Example");
		Group root=new Group(); 
		Polygon polygon=new Polygon();
		polygon.getPoints().addAll(new Double[]{0.0,0.0,100.0,200.0,200.0,100.0}); 
		root.getChildren().add(polygon); 
		Scene scene=new Scene(root,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}