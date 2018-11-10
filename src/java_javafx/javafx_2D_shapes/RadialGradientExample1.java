package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class RadialGradientExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Animation Example with RadialGradient");
		Group root=new Group(); 
		Scene scene=new Scene(root,400,300,Color.WHITE);
		primaryStage.setScene(scene);
		addRectangle(scene);
		primaryStage.show();		
	}
	private void addRectangle(final Scene scene)
	{
		Circle c=new Circle(200,150,100);
		RadialGradient gradient1=new RadialGradient(0,0.1,100,100,200,false,CycleMethod.NO_CYCLE,new Stop(0,Color.YELLOW),new Stop(1,Color.RED));
		c.setFill(gradient1);
		final Group root=(Group)scene.getRoot();
		root.getChildren().add(c);
	}
	public static void main(String args[])
	{
		Application.launch(args);
	}
}