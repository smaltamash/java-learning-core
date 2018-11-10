package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class EllipseExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		primaryStage.setTitle("Ellipse Example");
		Group group=new Group(); 
		Ellipse ellipse=new Ellipse(); 
		ellipse.setCenterX(100); 
        ellipse.setCenterY(100); 
        ellipse.setRadiusX(50);
        ellipse.setRadiusY(80);
        group.getChildren().addAll(ellipse); 
		Scene scene=new Scene(group,200,300,Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}