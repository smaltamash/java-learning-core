package java_javafx.javafx_animations;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class TranslateTransitionExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Circle 
        Circle cir=new Circle(50,100,50);
        //setting the color and stroke of the Circle
        cir.setFill(Color.RED);
        cir.setStroke(Color.BLACK);
        //instantiating TranslateTransition class
        TranslateTransition translate=new TranslateTransition();
        //shifting the X coordinate of the centre of the Circle by 400
        translate.setByX(400);
        //setting the Duration for the Translate Transition
        translate.setDuration(Duration.millis(1000));
        //setting cycle count for Translate Transition
        translate.setCycleCount(500);
        //the Transition will be set to be auto reversed by setting this to true
        translate.setAutoReverse(true);
        //setting Circle as the node onto which the transition will be applied	
        translate.setNode(cir);
        //playing the Transition
        translate.play();
        //creating Group and Scene
        Group root=new Group();
	    root.getChildren().add(cir);
	    Scene scene=new Scene(root,500,200,Color.WHEAT);	
	    primaryStage.setScene(scene);
		primaryStage.setTitle("TranslateTransition Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
