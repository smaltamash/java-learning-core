package java_javafx.javafx_animations;
import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
public class FillTransitionExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Polygon 
        //Polygon poly=new Polygon(250,120,80); //Company Symbol
        Polygon poly =new Polygon();
		//setting points for polygon
        poly.getPoints().addAll(new Double[] {220.0,270.0,170.0,220.0,170.0,120.0,220.0,70.0,270.0,120.0,270.0,220.0});  
        //setting the color and stroke of the Polygon
        poly.setStroke(Color.BLACK);
        //instantiating FillTransition class
        FillTransition fill=new FillTransition();
        //setting the Duration for the fill Transition
        fill.setDuration(Duration.millis(1000));
        //setting cycle count for fill Transition
        fill.setCycleCount(50);
        //the Transition will be set to be auto reversed by setting this to true
        fill.setAutoReverse(true);
        //setting initial value of color
        fill.setFromValue(Color.BLACK);
        //setting the Target value of the color
        fill.setToValue(Color.WHITE);
        //setting polygon as the shape onto which the fill tarnsition will be applied
        fill.setShape(poly);
        //playing the Transition
        fill.play();
        //creating Group and Scene
        Group root=new Group();
	    root.getChildren().add(poly);
	    Scene scene=new Scene(root,420,400,Color.WHEAT);	
	    primaryStage.setScene(scene);
		primaryStage.setTitle("FillTransition Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
