package java_awt_and_event.awt_and_event;
//By Extending Frame Class(Inheritance)
import java.awt.Frame;
import java.awt.Button;
public class FrameCreationMethodOne extends Frame
{
	FrameCreationMethodOne()
	{
		Button b=new Button("Click Me");
		b.setBounds(30,100,80,30); //Setting Button position
		add(b); //Adding Button into Frame
		setSize(300,300); //Frame size 300 width 300 height
		setLayout(null); //no Layout Manager
		setVisible(true);
	}
	public static void main(String args[])
	{
		FrameCreationMethodOne f=new FrameCreationMethodOne();
	}
}