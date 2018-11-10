package java_javafx.javafx_css;
import javafx.application.Application;    
import javafx.scene.Scene;    
import javafx.scene.control.Button;    
import javafx.scene.control.Label;    
import javafx.scene.control.TextField;    
import javafx.scene.layout.GridPane;  
import javafx.scene.text.Text;  
import javafx.stage.Stage;    
public class CSSExample2 extends Application 
{    
	@Override  
	public void start(Stage primaryStage) throws Exception 
	{    
		//Adding Labels to the form   
		Label first_name = new Label("First Name");    
		Label last_name = new Label("Last Name");  
		Label Email = new Label("Email ID");  
		Label Password = new Label("Password");  
		//Adding text-field to the form   
		TextField tf1=new TextField();    
		TextField tf2=new TextField();    
		TextField tf3=new TextField();    
		TextField tf4=new TextField();   
		//creating submit button   
		Button Submit=new Button ("Submit");  
		//setting ID for the submit button so that the particular style rules can be applied to it.   
		Submit.setId("submit");  
		//Creating reset button   
		Button Reset=new Button ("Reset");  
		//Creating title   
		Text title = new Text();  
		title.setText("Sign Up");  
		title.setX(120);  
		title.setY(120);  
		title.setUnderline(true);  
		title.setId("title");  
		//creating grid-pane  
		GridPane root=new GridPane();    
		//creating Scene object   
		Scene scene = new Scene(root,400,400);  
		//adding the the nodes to the GridPane's rows   
		root.addRow(0, title);  
		root.addRow(2, first_name,tf1);    
		root.addRow(3, last_name,tf2);   
		root.addRow(4, Email,tf3);    
		root.addRow(5, Password,tf4);   
		root.addRow(7, Submit,Reset);    
		//setting horizontal and vertical gaps between the rows   
		root.setHgap(10);  
		root.setVgap(10);  
		//adding style-sheet to the Scene   
		root.getStylesheets().add("form.css");  
		primaryStage.setScene(scene);    
		primaryStage.show();    
	}    
	public static void main(String[] args) 
	{    
		launch(args);    
	}    
}  
