package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class ArcExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Arc Example");
		Group group=new Group(); 
		Arc arc=new Arc(); 
		arc.setCenterX(100); 
        arc.setCenterY(100); 
        arc.setRadiusX(50);
        arc.setRadiusY(80);
        arc.setStartAngle(30);
        arc.setLength(70);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.RED);	
        group.getChildren().addAll(arc); 
		Scene scene=new Scene(group,200,300,Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}