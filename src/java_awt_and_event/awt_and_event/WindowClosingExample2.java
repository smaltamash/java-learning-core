package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//Closing AWT Window by extending WindowAdapter Class
public class WindowClosingExample2 extends WindowAdapter 	
{
	Frame f;
	WindowClosingExample2()
	{
		f=new Frame();
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public static void main(String args[])
	{
		new WindowClosingExample2();
	}
}