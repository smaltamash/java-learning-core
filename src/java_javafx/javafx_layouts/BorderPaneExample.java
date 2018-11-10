package java_javafx.javafx_layouts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane; 
import javafx.stage.Stage;
public class BorderPaneExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		BorderPane borderPane=new BorderPane();
		borderPane.setTop(new Label("This will be at the Top"));
		borderPane.setLeft(new Label("This will be at the Left"));
		borderPane.setRight(new Label("This will be at the Right"));
		borderPane.setCenter(new Label("This will be at the Center"));
		borderPane.setBottom(new Label("This will be at the Bottom"));
		Scene scene=new Scene(borderPane,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}