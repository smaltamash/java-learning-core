package java_javafx.javafx_ui;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class LabelExample2 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		StackPane root=new StackPane();
		FileInputStream input=new FileInputStream("src/javafx/javafx_ui/Images/Ciri1.jpg");
		Image img=new Image(input);
		ImageView imgView=new ImageView(img);
		Label myLabel=new Label("Ciri",imgView);
		Scene scene=new Scene(root,400,400);
		root.getChildren().add(myLabel);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Label Class Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}