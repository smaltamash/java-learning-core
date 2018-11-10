package java_javafx.javafx_2D_shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;
public class CubicCurveExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		primaryStage.setTitle("Cubic Curve Example");
		Group root=new Group(); 
		CubicCurve c=new CubicCurve();
		c.setStartX(20);
		c.setStartY(100);
		c.setControlX1(300);
		c.setControlX2(200);
		c.setControlY1(100);
		c.setControlY2(90);
		c.setFill(Color.RED);
		c.setEffect(new DropShadow());
		c.setEndX(100);
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