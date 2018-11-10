package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
//Closing AWT Window by implementing WindowListener Interface
public class WindowClosingExample3 extends Frame implements WindowListener 	
{
	WindowClosingExample3()
	{
		addWindowListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new WindowClosingExample3();
	}
	public void windowActivated(WindowEvent e) 
	{}  
public void windowClosed(WindowEvent e) 
{}  
public void windowClosing(WindowEvent e)
 {  
    dispose();  
}  
public void windowDeactivated(WindowEvent e) 
{}  
public void windowDeiconified(WindowEvent e) 
{}  
public void windowIconified(WindowEvent e) 
{}  
public void windowOpened(WindowEvent e) 
{}
}