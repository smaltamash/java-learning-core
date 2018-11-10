package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage;
public class TextFieldExample1 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Label userId=new Label("User ID");
		Label pass=new Label("Password");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		Button btn=new Button("Submit");
		GridPane root=new GridPane();
		root.addRow(0,userId,tf1);
		root.addRow(1,pass,tf2);
		root.addRow(2,btn);
		Scene scene=new Scene(root,800,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TextField Class Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}