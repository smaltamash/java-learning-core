package java_javafx.javafx_ui;
import javafx.application.Application;
import java.io.FileInputStream;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class ProgressBarExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		ProgressBar progressBar=new ProgressBar();
		//progressBar.setProgress(0.85f); //you can set the progress
		StackPane root=new StackPane();
		root.getChildren().add(progressBar);
		Scene scene=new Scene(root,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ProgressBar Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}