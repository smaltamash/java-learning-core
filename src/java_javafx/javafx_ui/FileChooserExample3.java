package java_javafx.javafx_ui;
import java.io.File;	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class FileChooserExample3 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		Button btn=new Button("SAVE");
		btn.setOnAction(e->
		{
			FileChooser file=new FileChooser();
			file.setTitle("Save Image");
			//System.out.println(pic.getId());
			File file1=file.showSaveDialog(primaryStage);
			System.out.println(file1);
		});
		StackPane root=new StackPane();
		Scene scene=new Scene(root,200,300);
		primaryStage.setScene(scene);
		root.getChildren().add(btn);
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
