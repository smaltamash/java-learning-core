package java_javafx.javafx_animations;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class StrokeTransitionExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Circle 
        Circle cir=new Circle(200,150,100);
        //setting the color and stroke of the Circle
        cir.setStroke(Color.BLUE);
        cir.setFill(Color.RED);
        cir.setStrokeWidth(10);
        //instantiating StrokeTransition class
        StrokeTransition stroke=new StrokeTransition();
        //setting the Duration for the stroke Transition
        stroke.setDuration(Duration.millis(500));
        //setting cycle count for stroke Transition
        stroke.setCycleCount(500);
        //the Transition will be set to be auto reversed by setting this to true
        stroke.setAutoReverse(true);
        //setting initial value of color
        stroke.setFromValue(Color.BLACK);
        //setting the Target value of the color
        stroke.setToValue(Color.PURPLE);
        //setting Circle as the shape onto which the stroke tarnsition will be applied
        stroke.setShape(cir);
        //playing the Transition
        stroke.play();
        //creating Group and Scene
        Group root=new Group();
	    root.getChildren().add(cir);
	    Scene scene=new Scene(root,420,300,Color.WHEAT);	
	    primaryStage.setScene(scene);
		primaryStage.setTitle("StrokeTransition Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
