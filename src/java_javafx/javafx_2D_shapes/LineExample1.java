package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class LineExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Line line=new Line(); //instantiating line class
		line.setStartX(0); //setting starting X point of Line
		line.setStartY(0); //setting starting Y point of Line
		line.setEndX(100); //setting ending X pint of Line
		line.setEndY(200); //setting ending Y point of Line
		Group root=new Group(); //creating a Group
		root.getChildren().add(line); //adding class object to the group
		Scene scene=new Scene(root,300,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Line Example");
		primaryStage.show();
		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}