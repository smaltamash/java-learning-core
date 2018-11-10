package java_javafx.javafx_css;
import javafx.application.Application;    
import javafx.scene.Scene;    
import javafx.scene.control.Button;    
import javafx.scene.control.Label;    
import javafx.scene.control.TextField;    
import javafx.scene.layout.GridPane;    
import javafx.stage.Stage;    
public class CSSExample3 extends Application
{   
	@Override  
	public void start(Stage primaryStage) throws Exception
	{    
		Label first_name=new Label("First Name");    
		// setting style for the label first_name   
		first_name.setStyle("-fx-background-color:Black; -fx-text-fill:white; -fx-font-size:16");  
		Label last_name=new Label("Last Name");    
		//setting style for the label last name   
		last_name.setStyle("-fx-background-color:Black; -fx-text-fill:white;-fx-font-size:16");  
		TextField tf1=new TextField();   
		//setting style for the first text field  
		tf1.setStyle("-fx-background-color:Wheat; -fx-text-fill:Black; -fx-font-size:16");  
		TextField tf2=new TextField();    
		//setting style for the second TextField   
		tf2.setStyle("-fx-background-color:Wheat; -fx-text-fill:Black; -fx-font-size:16");  
		Button Submit=new Button ("Submit");  
		//setting styles for the button   
		Submit.setStyle("-fx-background-color:Black; -fx-font-family:courier_new; -fx-text-fill:white;-fx-font-size:16");  
		GridPane root=new GridPane();    
		root.setHgap(10);  
		root.setVgap(15);  
		Scene scene = new Scene(root,400,200);    
		root.addRow(0, first_name,tf1);    
		root.addRow(1, last_name,tf2);    
		root.addRow(2, Submit);    
		primaryStage.setScene(scene);    
		primaryStage.show();    
	}    
	public static void main(String[] args) 
	{    
		launch(args);    
	}    
}    
