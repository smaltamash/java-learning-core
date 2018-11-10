package java_javafx.javafx_3D_shapes;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class CullFaceExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//creating the first sphere
		Sphere sphere1=new Sphere();
		sphere1.setRadius(50);
		sphere1.setTranslateX(100);
		sphere1.setTranslateY(200);
		//setting CullFacce for first Sphere
		sphere1.setCullFace(CullFace.BACK);
        //creating the second sphere
		Sphere sphere2=new Sphere();
		sphere2.setRadius(50);
		sphere2.setTranslateX(250);
		sphere2.setTranslateY(200);
		//setting CullFacce for second Sphere
		sphere2.setCullFace(CullFace.FRONT);
		//creating the third sphere
		Sphere sphere3=new Sphere();
		sphere3.setRadius(50);
		sphere3.setTranslateX(400);
		sphere3.setTranslateY(200);
		//setting CullFacce for third Sphere
		sphere3.setCullFace(CullFace.NONE);
		Group root=new Group();
	    root.getChildren().addAll(sphere1,sphere2,sphere3);
	    Scene scene=new Scene(root,500,400);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("CillFaces");
	    primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}