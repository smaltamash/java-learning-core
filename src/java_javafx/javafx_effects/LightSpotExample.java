package java_javafx.javafx_effects;
import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class LightSpotExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
	    Text text=new Text();
	    text.setFont(Font.font(null,FontWeight.BOLD,35));
	    text.setX(20);
	    text.setY(50);
	    text.setTextOrigin(VPos.TOP);
	    text.setText("Welcome to Java World");
	    text.setFill(Color.RED);
	    Light.Spot light=new Light.Spot();
	    light.setPointsAtX(0);
	    light.setPointsAtY(0);
	    light.setPointsAtZ(-50);
	    light.setSpecularExponent(5);
        Lighting lighting=new Lighting();
        text.setEffect(lighting);
	    Group root=new Group();
	    root.getChildren().add(text);
		Scene scene=new Scene(root,500,200);
		primaryStage.setTitle("Light.Spot Effect Example");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
