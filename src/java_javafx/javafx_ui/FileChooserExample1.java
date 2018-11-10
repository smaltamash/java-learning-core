package java_javafx.javafx_ui;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.HBox;  
import javafx.stage.FileChooser;  
import javafx.stage.Stage;  
public class FileChooserExample1 extends Application
{  
	@Override  
	public void start(Stage primaryStage) throws Exception
	{  
		// TODO Auto-generated method stub  
		FileChooser file = new FileChooser();  
		file.setTitle("Open File");  
		file.showOpenDialog(primaryStage);  
		HBox root = new HBox();  
		root.setSpacing(20);  
		Scene scene = new Scene(root,350,100);  
		primaryStage.setScene(scene);  
		primaryStage.setTitle("FileChooser Example");  
		primaryStage.show();  
	}  
	public static void main(String[] args)
	{  
		launch(args);  
	}  

}  
