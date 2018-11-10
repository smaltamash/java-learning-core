package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;
public class QuadCurveExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Quad Curve Example");
		Group root=new Group(); 
		QuadCurve c=new QuadCurve();
		c.setStartX(70);
		c.setStartY(30);
		c.setControlX(250);
		c.setControlY(50);
		c.setFill(Color.RED);
		c.setEffect(new DropShadow());
		c.setEndX(250);
		c.setEndY(300);
		root.getChildren().add(c);
		Scene scene=new Scene(root,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}