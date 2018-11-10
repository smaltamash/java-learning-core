package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;
public class RadioButtonExample extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		ToggleGroup tGroup=new ToggleGroup();
        RadioButton rButton1=new RadioButton("Option 1");
        RadioButton rButton2=new RadioButton("Option 2");        
        RadioButton rButton3=new RadioButton("Option 3");
        RadioButton rButton4=new RadioButton("Option 4"); 
        rButton1.setToggleGroup(tGroup);		
        rButton2.setToggleGroup(tGroup);
        rButton3.setToggleGroup(tGroup);
        rButton4.setToggleGroup(tGroup);	
        VBox root=new VBox();
        root.setSpacing(10);
        root.getChildren().addAll(rButton1,rButton2,rButton3,rButton4);		
		Scene scene=new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("RadioButton Class Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}