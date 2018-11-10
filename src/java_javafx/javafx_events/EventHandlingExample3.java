package java_javafx.javafx_events;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
public class EventHandlingExample3 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//adding Labels and TextFields to the scene
		Label l1=new Label("Press any Key");
		Label l2=new Label("Filtering Event");
		l1.setTranslateX(100);
		l1.setTranslateY(100);
		l2.setTranslateX(100);
		l2.setTranslateY(150);
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		tf1.setTranslateX(250);
		tf1.setTranslateY(100);
		tf2.setTranslateX(250);
		tf2.setTranslateY(150);
		//creating EventHandler Object
		EventHandler<KeyEvent> filter=new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent event)
			{
				//TODO Auto-generated method stub
				tf2.setText("Event : "+event.getEventType());
				tf1.setText(event.getText());
				event.consume();
			}
		};	
		//Registering Event Filter for the event generated on TextField
		tf1.addEventFilter(KeyEvent.ANY,filter);
		//setting group and scene
		Group root=new Group();
		root.getChildren().addAll(l1,l2,tf1,tf2);
		Scene scene=new Scene(root,500,300,Color.WHEAT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Adding EventFilter Example");
		primaryStage.show();
	}
	public static void main(String args[])throws Exception
	{
		launch(args);
	}
}