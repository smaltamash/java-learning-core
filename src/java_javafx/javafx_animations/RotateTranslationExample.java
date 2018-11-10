package java_javafx.javafx_animations;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
public class RotateTranslationExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Rectangle 
        Rectangle rect=new Rectangle(200,100,200,200);
        rect.setFill(Color.LIMEGREEN);
        rect.setStroke(Color.HOTPINK);
        rect.setStrokeWidth(5);
        //instantiating RotateTransition class
        RotateTransition rotate=new RotateTransition();
        //setting Axis of Rotation
        rotate.setAxis(Rotate.Z_AXIS);
        //setting the Angle of Rotation
        rotate.setByAngle(360);
        //setting Cycle count of the Rotation
        rotate.setCycleCount(500);
        //setting Duration of the Transition
        rotate.setDuration(Duration.millis(1000));
        //the Transition will be auto reversed by setting this to true
        rotate.setAutoReverse(true);
        //setting Rectangle as the node onto which the Transition will be applied
        rotate.setNode(rect);
        //playing the Transition
        rotate.play();
        //configuring the Group and Scene
        Group root=new Group();
	    root.getChildren().add(rect);
	    Scene scene=new Scene(root,600,400,Color.BLACK);	
	    primaryStage.setScene(scene);
		primaryStage.setTitle("RotateTransition Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
