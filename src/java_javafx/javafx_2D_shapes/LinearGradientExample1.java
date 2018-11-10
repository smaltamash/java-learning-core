package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class LinearGradientExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		VBox root=new VBox(); 
		final Scene scene=new Scene(root,300,250);
		Stop[] stops=new Stop[]{new Stop(0,Color.GREEN),new Stop(1,Color.BLUE)};
		LinearGradient linear=new LinearGradient(0,0,1,0,true,CycleMethod.NO_CYCLE,stops);
		Rectangle rect=new Rectangle(0,0,100,100);
		rect.setFill(linear);
		root.getChildren().add(rect);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Animation Example with LinearGradient");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}