package java_javafx.javafx_transformations;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
public class RotationExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating the rectangles with same coordinates
        Rectangle rect1=new Rectangle(20,20,200,150);
        Rectangle rect2=new Rectangle(20,20,200,150);
	    //setting Rectangle Properties
	    rect1.setFill(Color.LIMEGREEN);
	    rect1.setStroke(Color.BLACK);
	    rect2.setFill(Color.DARKGRAY);
	    rect2.setStroke(Color.BLACK);
	    //Instantiating the Rotate class
	    Rotate rotate=new Rotate();
        //setting the properties of Rotate object
        rotate.setAngle(30);
        rotate.setPivotX(100);
        rotate.setPivotY(300);
        //Rotating second rectangle
        rect2.getTransforms().add(rotate);	
	    Group root=new Group();
	    root.getChildren().addAll(rect1,rect2);
	    Scene scene=new Scene(root,500,420);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Rotation Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
