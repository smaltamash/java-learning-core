package java_javafx.javafx_events;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
public class EventHandlingExample4 extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//creating circle and setting stroke and color in the circle
		Circle c=new Circle(100,100,50);
		c.setFill(Color.GREEN);
		c.setStroke(Color.BLACK);
		//creating play button and setting coordinates for the button
		Button btn=new Button("Play");
        btn.setTranslateX(125);
        btn.setTranslateY(200);
        //creating pause button and setting coordinates for the pause button
        Button btn1=new Button("Pause");
        btn1.setTranslateX(175);
        btn1.setTranslateY(200);
        //Instantiating TranslateTransition class to create the animation
        TranslateTransition trans=new TranslateTransition();
        //setting attributes for the TranslateTransition
        trans.setAutoReverse(true);
        trans.setByX(200);
        trans.setCycleCount(100);
        trans.setDuration(Duration.millis(500));
        trans.setNode(c);
        //creating EventHandler
        EventHandler<MouseEvent> handler=new EventHandler<MouseEvent>(){
        	@Override
        	public void handle(MouseEvent event)
        	{
        		if(event.getSource()==btn)
        		{
        			trans.play(); //animation will be played when the play button is clicked
        		}
        		if(event.getSource()==btn1)
        		{
        			trans.pause(); //animation will be paused when the pause button is clicked
        		}
        		event.consume();
        	}
        };
        //Adding Handler for the play and pause button
        btn.setOnMouseClicked(handler);
        btn1.setOnMouseClicked(handler);
        //creating Group and Scene
        Group root=new Group();
		root.getChildren().addAll(c,btn,btn1);
		Scene scene=new Scene(root,420,300,Color.WHEAT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("EventHandler Example");
		primaryStage.show();
	}
	public static void main(String args[])throws Exception
	{
		launch(args);
	}
}