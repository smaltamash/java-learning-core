package java_javafx.javafx_layouts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage;
public class GridPaneExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Label firstName=new Label("First Name");
        Label lastName=new Label("Last Name");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
		Button submit=new Button("Submit");
		GridPane root=new GridPane();
		Scene scene=new Scene(root,400,200);
		root.addRow(0,firstName,tf1);
		root.addRow(1,lastName,tf2);
		root.addRow(2,submit);
		primaryStage.setScene(scene);
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}