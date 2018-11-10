package java_javafx.javafx_media;
import java.io.File;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
public class PlayingVideoExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Instantiating path for the media file,replace this with your file path
		//String path="src/java_javafx/javafx_media/Videos/Avengers 2 1080p.mp4"; //it is working without audio
		String path="src/java_javafx/javafx_media/Videos/Blank Space - Taylor Swift  1080p.mp4";
		//Instantiating Media Class
		Media media=new Media(new File(path).toURI().toString());
		//Instantiating MediaPlayer class
		MediaPlayer mediaPlayer=new MediaPlayer(media);
		//Instantiating MediaView class
		MediaView mediaView=new MediaView(mediaPlayer);
 		//by setting this property to true, the Video will be played
		mediaPlayer.setAutoPlay(true);
		//setting group and scene
		StackPane root=new StackPane();
		root.getChildren().add(mediaView);
		Scene scene=new Scene(root,1920,1080);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Playing Video");
		primaryStage.show();
	}
	public static void main(String args[])throws Exception
	{
		launch(args);
	}
}