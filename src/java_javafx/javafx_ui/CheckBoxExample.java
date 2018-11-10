package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox; 
import javafx.stage.Stage;
public class CheckBoxExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		CheckBox cBox1=new CheckBox("Radio One");
        CheckBox cBox2=new CheckBox("Radio Mirchi");        
        CheckBox cBox3=new CheckBox("Radio FM");
        CheckBox cBox4=new CheckBox("FM Gold"); 
        HBox root=new HBox();
        root.setSpacing(5);
        root.getChildren().addAll(cBox1,cBox2,cBox3,cBox4);		
		Scene scene=new Scene(root,800,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("CheckBox Class Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}