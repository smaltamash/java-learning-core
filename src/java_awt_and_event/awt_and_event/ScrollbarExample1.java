package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Scrollbar;
public class ScrollbarExample1
{
	public ScrollbarExample1()
	{
		Frame f=new Frame("Scrollbar Example1");
		Scrollbar s=new Scrollbar();
		s.setBounds(100,100,50,100);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ScrollbarExample1();
	}
}