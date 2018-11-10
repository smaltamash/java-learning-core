package java_javafx.javafx_layouts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;
public class VBoxExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Button btn1=new Button("Button 1");
		Button btn2=new Button("Button 2");
		VBox root=new VBox();
		Scene scene=new Scene(root,200,200);
		root.getChildren().addAll(btn1,btn2);
		primaryStage.setScene(scene);
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}