package java_javafx.javafx_ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class HyperlinkExample1 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Hyperlink hp=new Hyperlink("https://www.google.com");
		StackPane root=new StackPane();
		hp.setOnAction(e->System.out.println("Link Clicked"));
		root.getChildren().add(hp);
		Scene scene=new Scene(root,400,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hyperlink Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}