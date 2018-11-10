package java_javafx.javafx_transformations;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
public class TranslationExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating the rectangles with same coordinates
        Rectangle rect1=new Rectangle(20,20,200,150);
        Rectangle rect2=new Rectangle(20,20,200,150);
	    //setting Rectangle Properties
	    rect1.setFill(Color.RED);
	    rect1.setStroke(Color.BLACK);
	    rect1.setStrokeWidth(5);
	    rect2.setFill(Color.GREEN);
	    rect2.setStroke(Color.BLACK);
	    rect2.setStrokeWidth(5);
	    //Instantiating the Translate class
	    Translate translate=new Translate();
        //setting the properties of Translate object
        translate.setX(200);
        translate.setY(200);
        translate.setZ(200);
        //applying Translation to the second rectangle
        rect2.getTransforms().add(translate);	
	    Group root=new Group();
	    root.getChildren().addAll(rect1,rect2);
	    Scene scene=new Scene(root,500,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Translation Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
