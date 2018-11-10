package java_javafx.javafx_animations;
import javafx.application.Application;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
public class PathTransitionExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//creating Polygon
		Polygon poly=new Polygon();
		poly.getPoints().addAll(new Double[] {320.0,270.0,270.0,220.0,270.0,270.0,320.0,120.0,370.0,270.0,370.0,220.0}); 
		//setting Color and Stroke properties for the Polygon
		poly.setFill(Color.LIMEGREEN);
		poly.setStroke(Color.BLACK);
		//setting up the path
		Path path=new Path();
		path.getElements().add(new MoveTo(150f,70f));
		path.getElements().add(new CubicCurveTo(240f,230f,500f,340f,600f,50f));
		//instantiating PathTransition class
		PathTransition pathTransition=new PathTransition();
		//setting duration for the path Transition
		pathTransition.setDuration(Duration.millis(1000));
		//setting Node on which PathTransition will be applied
		pathTransition.setNode(poly);
		//setting path for the Path Transition
		pathTransition.setPath(path);
		//setting Orientation for the Path
		pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT); //try commenting out this line
		//setting up the cycle count
		pathTransition.setCycleCount(10);
		//setting auto reverse to be true
		pathTransition.setAutoReverse(true);
		//playing Path Transition
		pathTransition.play();
		//configuring Group and Scene
		Group root=new Group();
		root.getChildren().add(poly);
		Scene scene=new Scene(root,700,350,Color.WHEAT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PathTransition Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}