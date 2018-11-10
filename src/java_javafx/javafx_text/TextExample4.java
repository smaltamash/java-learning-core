package java_javafx.javafx_text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class TextExample4 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		Text text=new Text();
		text.setX(100);
		text.setY(20);
		text.setFont(Font.font("Liberation Serif",25));
		text.setText("Hello !!");
		text.setStrikethrough(true);
		Text text1=new Text();
		text1.setX(100);
		text1.setY(140);
		text1.setText("Welcome to Java World !");
		text1.setFont(Font.font("Liberation Serif",25));
		text1.setUnderline(true);
		Group root=new Group();
		Scene scene=new Scene(root,500,200);
		root.getChildren().addAll(text,text1);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Text Example");
		primaryStage.show();		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
