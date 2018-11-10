package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class CircleExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Circle Example");
		Group group=new Group(); 
		Circle circle=new Circle(); 
		circle.setCenterX(200); 
        circle.setCenterY(200); 
        circle.setRadius(100);
        circle.setFill(Color.RED);	
        group.getChildren().add(circle); 
		Scene scene=new Scene(group,400,500,Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}