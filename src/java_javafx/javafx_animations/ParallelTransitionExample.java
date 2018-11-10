package java_javafx.javafx_animations;
import javafx.animation.FadeTransition;  
import javafx.animation.ParallelTransition;  
import javafx.animation.PauseTransition;  
import javafx.animation.RotateTransition;  
import javafx.animation.ScaleTransition;  
import javafx.animation.TranslateTransition;   
import javafx.application.Application;   
import javafx.scene.Group;   
import javafx.scene.Scene;   
import javafx.scene.paint.Color;  
import javafx.scene.shape.Polygon;  
import javafx.stage.Stage;   
import javafx.util.Duration;   
public class ParallelTransitionExample extends Application 
{   
	@Override   
	public void start(Stage primaryStage) 
	{        
		//Setting points for the polygon   
		Polygon poly = new Polygon();   
		poly.getPoints().addAll(new Double[] {320.0,270.0,270.0,220.0,270.0,270.0,320.0,120.0,370.0,270.0,370.0,220.0});  
		//Setting Color and Stroke properties for the polygon    
		poly.setFill(Color.LIMEGREEN);  
		poly.setStroke(Color.BLACK);  
		//Setting durations for the transition   
		Duration dur1 = Duration.millis(1000);  
		Duration dur2 = Duration.millis(1000);  
		//Setting the pause transition  
		PauseTransition pause = new PauseTransition(Duration.millis(1000));  
		//Setting the fade transition   
		FadeTransition fade = new FadeTransition(dur2);  
		fade.setFromValue(1.0f);  
		fade.setToValue(0.3f);  
		fade.setCycleCount(5);  
		fade.setAutoReverse(true);  
		//Setting Translate transition  
		TranslateTransition translate = new TranslateTransition(dur1);  
		translate.setToX(-150f);  
		translate.setCycleCount(5);  
		translate.setAutoReverse(true);  
		//Setting Rotate Transition   
		RotateTransition rotate = new RotateTransition(dur2);  
		rotate.setByAngle(360f);  
		rotate.setCycleCount(5);  
		rotate.setAutoReverse(true);  
		//Setting Scale Transition   
		ScaleTransition scale = new ScaleTransition(dur1);  
		scale.setByX(1.5f);  
		scale.setByY(1.2f);  
		scale.setCycleCount(5);  
		scale.setAutoReverse(true);  
		//Instantiating Parallel Transition class by passing the list of transitions into its constructor  
		ParallelTransition parT = new ParallelTransition (poly,rotate, pause, fade, translate,  scale);  
		//playing the transition   
		parT.play();  
		//Configuring the group and scene   
		Group root = new Group();  
		root.getChildren().addAll(poly);  
		Scene scene = new Scene(root,490,450,Color.WHEAT);  
		primaryStage.setScene(scene);  
		primaryStage.setTitle("Parallel Transition Example");  
		primaryStage.show();  
	}        
	public static void main(String args[])
	{   
		launch(args);   
	}   
}  