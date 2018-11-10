package java_javafx.javafx_media;
import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
public class PalyingAudioExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Instantiating path for the media file,replace this with your file path
		String path="src/java_javafx/javafx_media/Audios/Jitni Dafa 320Kbps.mp3";
		//Instantiating Media Class
		Media media=new Media(new File(path).toURI().toString());
		//Instantiating MediaPlayer class
		MediaPlayer mediaPlayer=new MediaPlayer(media);
		//by setting this property to true, the audio will be played
		mediaPlayer.setAutoPlay(true);
		primaryStage.setTitle("Playing Audio");
		primaryStage.show();
	}
	public static void main(String args[])throws Exception
	{
		launch(args);
	}
}