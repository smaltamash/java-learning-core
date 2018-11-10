package java_javafx.javafx_text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class TextExample2 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Text text=new Text();
		text.setX(100);
		text.setY(20);
		text.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,20));
		text.setText("Hello !! Welcome to Java World");
		Group root=new Group();
		Scene scene=new Scene(root,500,200);
		root.getChildren().add(text);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Text Example");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
