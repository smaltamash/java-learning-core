package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class LabelExample1 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Label myLabel=new Label("This is an Example of Label");
		StackPane root=new StackPane();
		Scene scene=new Scene(root,300,300);
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