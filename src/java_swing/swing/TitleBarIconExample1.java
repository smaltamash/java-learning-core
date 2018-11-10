package java_swing.swing;
//*
//Title Bar Icon in Swing
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;
public class TitleBarIconExample1
{
	TitleBarIconExample1()
	{
		JFrame f=new JFrame();
		Image icon=Toolkit.getDefaultToolkit().getImage("src/java_swing/swing/Images/Witcher3.png");
	    f.setIconImage(icon);
	    f.setLayout(null);
	    f.setSize(400,400);
	    f.setVisible(true);	
	}
  public static void main(String args[])
	{
		new TitleBarIconExample1();	
  }
}
/*/



/*
//Title Bar Icon in AWT
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
public class TitleBarIconExample1
{
	TitleBarIconExample1()
	{
		Frame f=new Frame();
		Image icon=Toolkit.getDefaultToolkit().getImage("src/java_awt_and_event/awt_and_event/Images/Witcher3.png");
	    f.setIconImage(icon);
	    f.setLayout(null);
	   f.setSize(400,400);
	    f.setVisible(true);	
	}
  public static void main(String args[])
	{
		new TitleBarIconExample1();	
  }
}
//*/