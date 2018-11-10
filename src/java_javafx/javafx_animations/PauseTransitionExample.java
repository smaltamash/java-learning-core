package java_javafx.javafx_animations;
import javafx.animation.FadeTransition;  
import javafx.animation.PauseTransition;  
import javafx.animation.RotateTransition;  
import javafx.animation.SequentialTransition;  
import javafx.animation.TranslateTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Polygon;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class PauseTransitionExample extends Application
{  
	@Override  
	public void start(Stage primaryStage) throws Exception 
	{  
		// TODO Auto-generated method stub  
		//Creating polygon   
		Polygon poly = new Polygon();   
		poly.getPoints().addAll(new Double[] {320.0,270.0,270.0,220.0,270.0,270.0,320.0,120.0,370.0,270.0,370.0,220.0});  
		//Setting Color and Stroke properties for the polygon    
		poly.setFill(Color.LIMEGREEN);  
		poly.setStroke(Color.BLACK);  
		//Setting Rotate Transition   
		RotateTransition rt = new RotateTransition(Duration.millis(500),poly);  
		rt.setByAngle(180);  
		rt.setCycleCount(2);  
		rt.setAutoReverse(true);  
		//Setting Translate Transition   
		TranslateTransition translate = new TranslateTransition(Duration.millis(500),poly);  
		translate.setToX(-150f);  
		translate.setCycleCount(2);  
		translate.setAutoReverse(true);  
		//Setting Fade Transition   
		FadeTransition fade = new FadeTransition(Duration.millis(500),poly);  
		fade.setFromValue(1.0f);  
		fade.setToValue(0.5f);  
		fade.setCycleCount(2);  
		fade.setAutoReverse(true);  
		//Setting Sequential Transition and pause after each transition passed in the list   
		SequentialTransition seqTransition = new SequentialTransition (fade,new PauseTransition(Duration.millis(2000)),rt,new PauseTransition(Duration.millis(2000)),translate);  
		//Playing Sequential Transition   
		seqTransition.play();  
		//Setting Group and scene   
		Group root = new Group();  
		root.getChildren().addAll(poly);  
		Scene scene = new Scene(root,490,300,Color.WHEAT);  
		primaryStage.setScene(scene);  
		primaryStage.setTitle("Pause Transition Example");  
		primaryStage.show();  
	}  
	public static void main(String[] args) 
	{  
		launch(args);  
	}  
} 