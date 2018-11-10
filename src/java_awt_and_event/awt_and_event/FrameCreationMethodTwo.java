package java_awt_and_event.awt_and_event;
//By Creating Object of Frame Class(Association)
import java.awt.Frame;
import java.awt.Button;
public class FrameCreationMethodTwo extends Frame
{
	FrameCreationMethodTwo()
	{
		Frame f=new Frame();
		Button b=new Button("Click Me");
		b.setBounds(30,50,80,30); //Setting Button position
		f.add(b); //Adding Button into Frame
		f.setSize(300,300); //Frame size 300 width 300 height
		f.setLayout(null); //no Layout Manager
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		FrameCreationMethodTwo f=new FrameCreationMethodTwo();
	}
}