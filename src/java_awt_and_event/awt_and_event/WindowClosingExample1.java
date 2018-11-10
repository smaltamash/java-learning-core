package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//Closing AWT Window by Anonymous Class
public class WindowClosingExample1 extends Frame 	
{
	WindowClosingExample1()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new WindowClosingExample1();
	}
}