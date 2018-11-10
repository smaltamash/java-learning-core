package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class LineExample2 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Line Drawing Example");
		Line line1=new Line(10,50,150,50); //Line(startX,startY,endX,endY)
		Line line2=new Line(10,100,150,100);
		Line line3=new Line(10,50,10,100);
		Line line4=new Line(150,50,150,100);
		Group root=new Group(); 
		root.getChildren().addAll(line1,line2,line3,line4);
		Scene scene=new Scene(root,300,200,Color.GREEN);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}