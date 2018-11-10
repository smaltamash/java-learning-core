package java_javafx.javafx_events;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class EventHandlingExample2 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//creating TextField and setting Position for Them
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		tf1.setTranslateX(100);
		tf1.setTranslateY(100);
		tf2.setTranslateX(300);
		tf2.setTranslateY(100);
		//handling KeyEvent for textfield 1
		tf1.setOnKeyPressed(new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent key)
			{
				//TODO Auto-generated method stub
				tf2.setText("KeyPressed : "+""+key.getText());	 
			}
		});
		//configuring group and scene
		Group root=new Group();
		root.getChildren().addAll(tf1,tf2);
		Scene scene=new Scene(root,500,200,Color.WHEAT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Handling KeyEvent Example");
		primaryStage.show();
	}
	public static void main(String args[])throws Exception
	{
		launch(args);
	}
}