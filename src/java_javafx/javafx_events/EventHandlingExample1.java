package java_javafx.javafx_events;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class EventHandlingExample1 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//creating Rectangle
		Rectangle rect=new Rectangle(100,100,120,120);
		//setting Stroke and Color for the Rectangle
		rect.setFill(Color.RED);
		rect.setStroke(Color.BLACK);
		//instantiating RotateTransition class
		RotateTransition rotate=new RotateTransition();	
		//setting properties for the RotateTransition class
		rotate.setAutoReverse(false);
		rotate.setByAngle(360);
		rotate.setCycleCount(500);
		rotate.setDuration(Duration.millis(500));
		rotate.setNode(rect);
		//creating the play Button
		Button btn=new Button();
		//setting properties for the play Button
		btn.setText("Play");
		btn.setTranslateX(100);
		btn.setTranslateY(250);
		//defining the convenience method to register the event handler to handle the ActionEvent
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent args0)
			{
				//TODO Auto-generated method stub
				rotate.play();
			}
		});
		//creating the play Button
		Button btn1=new Button();
		//setting properties for the play Button
		btn1.setText("Pause");
		btn1.setTranslateX(160);
		btn1.setTranslateY(250);
		//handling event for pause button click event
		btn1.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent args0)
			{
				//TODO Auto-generated method stub
				rotate.pause();
			}
		});
		//configuring group and scene
		Group root=new Group();
		root.getChildren().addAll(btn,rect,btn1);
		Scene scene=new Scene(root,400,350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Handling ActionEvent Example");
		primaryStage.show();
	}
	public static void main(String args[])throws Exception
	{
		launch(args);
	}
}