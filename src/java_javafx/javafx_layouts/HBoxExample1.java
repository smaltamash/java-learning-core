package java_javafx.javafx_layouts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox; 
import javafx.stage.Stage;
public class HBoxExample1 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Button btn1=new Button("Button 1");
		Button btn2=new Button("Button 2");
		HBox root=new HBox();
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