package java_javafx.javafx_transformations;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;
public class ShearingExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating Rectangles 
        Rectangle rect1=new Rectangle(60,100,150,200);
        Rectangle rect2=new Rectangle(350,100,150,200);
        Rectangle rect3=new Rectangle(640,100,150,200);
        //creating Text node just for the identification
        Text text1=new Text("After X Shear");
        Text text2=new Text("Original");
        Text text3=new Text("After Y Shear");
        //setting the positions and the fonts for the text nodes
        text1.setX(70);
        text1.setY(370);
        text2.setX(380);
        text2.setY(370);
        text3.setX(640);
        text3.setY(370);
        text1.setFont(Font.font("calibri",FontWeight.BOLD,FontPosture.ITALIC,20));
        text2.setFont(Font.font("calibri",FontWeight.BOLD,FontPosture.ITALIC,20));
        text3.setFont(Font.font("calibri",FontWeight.BOLD,FontPosture.ITALIC,20));
        //setting the stroke and color of the Rectangles
        rect1.setFill(Color.BLUE);
        rect1.setStroke(Color.BLACK);
        rect2.setFill(Color.DARKGRAY);
        rect2.setStroke(Color.BLACK);
        rect3.setFill(Color.PINK);
        rect3.setStroke(Color.BLACK);
        //creating the Shear transformation
        Shear shearX=new Shear();
        //setting properties for the shear, the Y coordinate //needs to set to (0,0) for the X-Shear Transformation
        shearX.setPivotX(200);
        shearX.setPivotY(250);
        shearX.setX(0.3);
        shearX.setY(0.0);
        //applying the shear to the first Rectangle
        rect1.getTransforms().add(shearX);
        //creating the shear for the third triangle
        Shear shearY=new Shear();
        //setting the properties for shear, X coordinates needs //to be set to (0,0) in order to implement Y-Shear
        shearY.setPivotX(600);
        shearY.setPivotY(80);
        shearY.setX(0.0);
        shearY.setY(0.2);
        rect3.getTransforms().add(shearY);
        Group root=new Group();
	    root.getChildren().addAll(rect1,rect2,rect3,text1,text2,text3);
	    Scene scene=new Scene(root,880,420);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shear Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
