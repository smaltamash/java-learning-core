package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage;
public class PasswordFieladExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Label userId=new Label("User ID");
		Label pass=new Label("Password");
		TextField tf=new TextField();
		PasswordField pf=new PasswordField();
		pf.setPromptText("Enter Password");
		Button btn=new Button("Submit");
		btn.setOnAction(e->System.out.println("You Entered User_ID : "+tf.getText()+" Password : "+pf.getText()));
		GridPane root=new GridPane();
		root.addRow(0,userId,tf);
		root.addRow(1,pass,pf);
		root.addRow(2,btn);
		Scene scene=new Scene(root,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PasswordField Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}