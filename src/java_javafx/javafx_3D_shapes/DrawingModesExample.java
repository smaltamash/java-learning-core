package java_javafx.javafx_3D_shapes;
import javafx.application.Application;  
import javafx.scene.Group;  
//import javafx.scene.ParallelCamera;  
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;  
import javafx.scene.shape.Box;  
import javafx.scene.shape.DrawMode;  
import javafx.stage.Stage;  
public class DrawingModesExample extends Application
{  
	@Override  
	public void start(Stage primaryStage) throws Exception 
	{  
		// TODO Auto-generated method stub  
		//Creating Boxes   
		Box box1 = new Box();  
		Box box2 = new Box();  
		//Setting properties for second box   
		box2.setTranslateX(450);  
		box2.setTranslateY(300);  
		box2.setTranslateZ(100);  
		box2.setHeight(150);  
		box2.setWidth(50);  
		box2.setDepth(400);  
		//Setting properties for first box  
		box1.setHeight(100);  
		box1.setWidth(100);  
		box1.setDepth(400);  
		box1.setTranslateX(200);  
		box1.setTranslateY(200);  
		box1.setTranslateZ(200);  
		//Setting DrawModes for the boxes   
		box1.setDrawMode(DrawMode.FILL);  
		box2.setDrawMode(DrawMode.LINE);  
		//Setting the perspective camera  
		//ParallelCamera camera = new ParallelCamera(); //try using this line see how it works
		PerspectiveCamera camera=new PerspectiveCamera(); //comment this line 
		camera.setTranslateX(100);  
		camera.setTranslateY(100);  
		camera.setTranslateZ(50);  
		//Configuring Group, Scene and Stage  
		Group root = new Group();  
		root.getChildren().addAll(box1,box2);  
		Scene scene = new Scene(root,450,350);  
		scene.setCamera(camera);  
		primaryStage.setScene(scene);  
		primaryStage.setTitle("Setting DrawMode");  
		primaryStage.show();  
	}  
	public static void main(String[] args) 
	{  
		launch(args);  
	}  
}  
