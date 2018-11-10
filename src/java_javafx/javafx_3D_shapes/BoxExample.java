package java_javafx.javafx_3D_shapes;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
public class BoxExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Creating Boxes
		Box box1=new Box();
		Box box2=new Box();
		//setting properties for second Box
		box2.setTranslateX(450);
		box2.setTranslateY(300);
		box2.setTranslateZ(100);
		box2.setHeight(150);
		box2.setWidth(50);
		box2.setDepth(400);
		//setting properties for first Box
		box1.setHeight(100);
		box1.setWidth(100);
		box1.setDepth(400);
		box1.setTranslateX(200);
		box1.setTranslateY(200);
		box1.setTranslateZ(200);
		//setting the PerspectiveCamera 
		PerspectiveCamera camera=new PerspectiveCamera();
		camera.setTranslateX(100);
		camera.setTranslateY(100);
		camera.setTranslateZ(50);	
		//configuring Scene, Stage and Group
		Group root=new Group();
		root.getChildren().addAll(box1,box2);
		Scene scene=new Scene(root,450,350,Color.LIMEGREEN);
		scene.setCamera(camera);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Box Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}