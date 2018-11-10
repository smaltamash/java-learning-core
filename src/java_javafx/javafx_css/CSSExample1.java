package java_javafx.javafx_css;
import javafx.application.Application;    
import javafx.scene.Scene;    
import javafx.scene.control.Button;    
import javafx.scene.control.Label;    
import javafx.scene.control.TextField;    
import javafx.scene.layout.GridPane;    
import javafx.stage.Stage;    
public class CSSExample1 extends Application 
{   
	@Override  
	public void start(Stage primaryStage) throws Exception 
	{    
		Label first_name=new Label("First Name");    
		Label last_name=new Label("Last Name");    
		TextField tf1=new TextField();    
		TextField tf2=new TextField();    
		Button Submit=new Button ("Submit");     
		GridPane root=new GridPane();    
		root.setHgap(10);  
		root.setVgap(15);  
		Scene scene = new Scene(root,400,200);    
		root.addRow(0, first_name,tf1);    
		root.addRow(1, last_name,tf2);    
		root.addRow(2, Submit);    
		//Adding CSS file to the root   
		root.getStylesheets().add("Style.css");  
		primaryStage.setScene(scene);    
		primaryStage.show();    
	}    
	public static void main(String[] args) 
	{    
		launch(args);    
	}    

}   

