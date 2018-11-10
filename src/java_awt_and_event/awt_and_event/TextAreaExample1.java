package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.TextArea;
public class TextAreaExample1
{
	TextAreaExample1()
	{
		Frame f=new Frame("TextArea Example1");
		TextArea area=new TextArea("Harleen Jain");
		area.setBounds(10,30,300,300);
		f.add(area);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new TextAreaExample1();
	}
}