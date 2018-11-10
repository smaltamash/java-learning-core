package java_javafx.javafx_ui;
import java.io.FileInputStream;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;
public class ButtonExample5 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		FileInputStream input=new FileInputStream("src/javafx/javafx_ui/Images/Shani1.jpeg");
		Image img=new Image(input);
		ImageView imgView=new ImageView(img);
		DropShadow shadow=new DropShadow();
		StackPane root=new StackPane();
		Button button=new Button();
		button.setEffect(shadow);
		button.setGraphic(imgView);
		button.setWrapText(true);
		button.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent args0)
			{
				//TODO Auto-generated method stub
				System.out.println("Button Clicked");

			}
		});
		Scene scene=new Scene(root,500,500);
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