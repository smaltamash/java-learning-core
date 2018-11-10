package java_javafx.javafx_ui;
import javafx.application.Application;
import java.io.FileInputStream;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class HyperlinkExample2 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Hyperlink hp=new Hyperlink();
		hp.setOnAction(e->System.out.println("Link Clicked"));
		FileInputStream input=new FileInputStream("src/javafx/javafx_ui/Images/Keira Mitz1.jpeg");
		Image img=new Image(input);
		ImageView imgView=new ImageView(img);
		hp.setGraphic(imgView);
		StackPane root=new StackPane();
		root.getChildren().add(hp);
		Scene scene=new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hyperlink Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}