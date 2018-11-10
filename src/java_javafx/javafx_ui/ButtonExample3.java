package java_javafx.javafx_ui;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class ButtonExample3 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		FileInputStream input=new FileInputStream("src/javafx/javafx_ui/Images/Yennefer1.jpg");
		Image img=new Image(input);
		ImageView imgView=new ImageView(img);
		StackPane root=new StackPane();
		Button button=new Button( );
		button.setGraphic(imgView);
		button.setWrapText(true);
		Scene scene=new Scene(root,1000,1000);
		root.getChildren().add(button);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Button Class Example");
		primaryStage.show();		
	} 
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}