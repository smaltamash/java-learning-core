package java_javafx.javafx_transformations;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
public class ScalingExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    //creating the Circles with same coordinates
        Circle cir1=new Circle(230,200,100);
        Circle cir2=new Circle(550,200,100);
	    //setting the color and stroke of Circles 
	    cir1.setFill(Color.YELLOW);
	    cir1.setStroke(Color.BLACK);
	    cir2.setFill(Color.YELLOW);
	    cir2.setStroke(Color.BLACK);
	    //creating the text nodes for identification
	    Text text1=new Text("Original Circle");
	    Text text2=new Text("Scaled with factor 1.5 in XY");
	    //setting the properties for the text nodes	
	    text1.setX(150);
	    text1.setY(400);
	    text2.setX(400);
	    text2.setY(400);
	    text1.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.ITALIC,20));
	    text2.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.ITALIC,20));
	    //creating a 2D Scale
	    Scale scale=new Scale();
        //setting the X-Y factors for the scale
        scale.setX(1.5);
        scale.setY(1.5);
        //setting the pivot points along which the scaling is done
        scale.setPivotX(550);
        scale.setPivotY(200);
        //applying the transformation to the second Circle
        cir2.getTransforms().add(scale);
	    Group root=new Group();
	    root.getChildren().addAll(cir1,cir2,text1,text2);
	    Scene scene=new Scene(root,800,450);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scale Example");
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
