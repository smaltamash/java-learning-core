package java_javafx.javafx_animations;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class ScaleTransitionExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Circle 
        Circle cir=new Circle(250,200,50);
        //setting the color and stroke of the Circle
        cir.setFill(Color.RED);
        cir.setStroke(Color.BLACK);
        //instantiating ScaleTransition class
        ScaleTransition scale=new ScaleTransition();
        scale.setByX(2);
        scale.setByY(2);
        //setting the Duration for the Scale Transition
        scale.setDuration(Duration.millis(1000));
        //setting cycle count for Scale Transition
        scale.setCycleCount(500);
        //the Transition will be set to be auto reversed by setting this to true
        scale.setAutoReverse(true);
        //setting Circle as the node onto which the transition will be applied	
        scale.setNode(cir);
        //playing the Transition
        scale.play();
        //creating Group and Scene
        Group root=new Group();
	    root.getChildren().add(cir);
	    Scene scene=new Scene(root,500,400,Color.WHEAT);	
	    primaryStage.setScene(scene);
		primaryStage.setTitle("ScaleTransition Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
