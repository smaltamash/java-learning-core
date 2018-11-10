package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Button;
public class ButtonExample1
{
	ButtonExample1()
	{
		Frame f=new Frame("Button Example1");
		Button b=new Button("Click Me");
		b.setBounds(50,100,80,30);
		f.add(b); 
		f.setSize(300,300);
		f.setLayout(null); 
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ButtonExample1();
	}
}