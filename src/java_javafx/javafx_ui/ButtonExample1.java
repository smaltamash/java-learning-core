package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class ButtonExample1 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		StackPane root=new StackPane();
		Button button=new Button("This is a Button");
		Scene scene=new Scene(root,300,300);
		root.getChildren().add(button);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Button Class Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}