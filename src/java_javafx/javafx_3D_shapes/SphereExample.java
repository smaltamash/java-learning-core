package java_javafx.javafx_3D_shapes;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class SphereExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Creating Spheres
		Sphere sphere=new Sphere();
		//setting the radius and height for the Sphere object
		sphere.setRadius(100);
		sphere.setTranslateX(200);
		sphere.setTranslateY(150);
		sphere.setCullFace(CullFace.BACK);
		//setting the PerspectiveCamera 
		PerspectiveCamera camera=new PerspectiveCamera();
		camera.setTranslateX(-50);
		camera.setTranslateY(0);
		camera.setTranslateZ(0);	
		//setting group and stage
		Group root=new Group();
		root.getChildren().add(sphere);
		Scene scene=new Scene(root,500,300,Color.LIMEGREEN);
		scene.setCamera(camera);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Sphere Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}