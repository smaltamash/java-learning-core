package java_javafx.javafx_3D_shapes;
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.PerspectiveCamera;  
import javafx.scene.Scene;  
import javafx.scene.image.Image;  
import javafx.scene.paint.Color;  
import javafx.scene.paint.PhongMaterial;  
import javafx.scene.shape.Cylinder;  
import javafx.scene.shape.Sphere;  
import javafx.stage.Stage;  
public class MaterialExample extends Application
{  
	@Override  
	public void start(Stage primaryStage) throws Exception 
	{  
		// TODO Auto-generated method stub  
		//Creating Cylinder 1  
		Cylinder cyn = new Cylinder();  
		cyn.setRadius(70);  
		cyn.setHeight(200);  
		cyn.setTranslateX(180);  
		cyn.setTranslateY(150);  
		//Creating cylinder 2   
		Cylinder cyn1=new Cylinder();  
		cyn1.setRadius(70);  
		cyn1.setHeight(200);  
		cyn1.setTranslateX(380);  
		cyn1.setTranslateY(150);  
		//Creating cylinder 3  
		Cylinder cyn2=new Cylinder();  
		cyn2.setRadius(70);  
		cyn2.setHeight(200);  
		cyn2.setTranslateX(580);  
		cyn2.setTranslateY(150);  
		//Creating Sphere   
		Sphere s=new Sphere();  
		s.setRadius(70);  
		s.setTranslateX(780);  
		s.setTranslateY(150);  
		//Setting Material 1  
		Image img1 = new Image("https://www.javatpoint.com/kotlin/images/kotlin-tutorial.png");  
		PhongMaterial mat = new PhongMaterial();  
		mat.setDiffuseMap(img1);  
		mat.setDiffuseColor(Color.WHITE);  
		//Setting Material 2  
		PhongMaterial mat2 = new PhongMaterial();  
		mat2.setSelfIlluminationMap(img1);  
		//Setting Material 3  
		PhongMaterial mat3 = new PhongMaterial();  
		mat3.setSpecularMap(img1);  
		//Setting Material for sphere  
		PhongMaterial mat4 = new PhongMaterial();  
		mat4.setDiffuseColor(Color.BLUE);  
		// Applying Material to     mat4.setBumpMap(img1);the shape   
		cyn.setMaterial(mat);  
		cyn1.setMaterial(mat2);  
		cyn2.setMaterial(mat3);  
		s.setMaterial(mat4);  
		//Setting Camera    mat4.setBumpMap(img1);  
		PerspectiveCamera camera = new PerspectiveCamera();  
		camera.setTranslateX(20);  
		camera.setTranslateY(10);  
		camera.setTranslateZ(50);  
		//setting group and stage   
		Group root = new Group();  
		root.getChildren().addAll(cyn,cyn1,cyn2,s);  
		Scene scene = new Scene(root,900,300,Color.WHITE);  
		scene.setCamera(camera);  
		primaryStage.setScene(scene);  
		primaryStage.setTitle("Material Example");  
		primaryStage.show();  
	}  
	public static void main(String[] args) 
	{  
		launch(args);  
	}  
}  