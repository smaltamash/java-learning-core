package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowAdapterExample1 
{
	Frame f;
	WindowAdapterExample1()
	{
		f=new Frame("WindowAdapter Example1");
		f.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					f.dispose();
				}
			});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new WindowAdapterExample1();
	}
}