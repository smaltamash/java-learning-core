package java_javafx.javafx_animations;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class FadeTransitionExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Circle 
        Circle cir=new Circle(250,120,80);
        //setting the color and stroke of the Circle
        cir.setFill(Color.RED);
        cir.setStroke(Color.BLACK);
        //instantiating FadeTransition class
        FadeTransition fade=new FadeTransition();
        //setting the Duration for the fade Transition
        fade.setDuration(Duration.millis(5000));
        //setting the initial and the target Opacity value for the Transition
        fade.setFromValue(10);
        fade.setToValue(0.1);
        //setting cycle count for fade Transition
        fade.setCycleCount(1000);
        //the Transition will be set to be auto reversed by setting this to true
        fade.setAutoReverse(true);
        //setting Circle as the node onto which the transition will be applied	
        fade.setNode(cir);
        //playing the Transition
        fade.play();
        //creating Group and Scene
        Group root=new Group();
	    root.getChildren().add(cir);
	    Scene scene=new Scene(root,500,250,Color.WHEAT);	
	    primaryStage.setScene(scene);
		primaryStage.setTitle("FadeTransition Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
