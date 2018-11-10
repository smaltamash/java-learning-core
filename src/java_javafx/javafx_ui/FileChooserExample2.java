package java_javafx.javafx_ui;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.HBox;  
import javafx.stage.FileChooser;  
import javafx.stage.Stage;  
public class FileChooserExample2 extends Application
{  
	@Override  
	public void start(Stage primaryStage) throws Exception 
	{  
		// TODO Auto-generated method stub  
		Label label = new Label("File:");  
		TextField tf= new TextField();  
		Button btn = new Button("Browse");  
		btn.setOnAction(e->  
		{  
			FileChooser file = new FileChooser();  
			file.setTitle("Open File");  
			file.showOpenDialog(primaryStage);  
		});  
		HBox root = new HBox();  
		//root.getChildren().add(file);  
		root.setSpacing(20);  
		root.getChildren().addAll(label,tf,btn);  
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