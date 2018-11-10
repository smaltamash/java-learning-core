package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Choice;
public class ChoiceExample1
{
	ChoiceExample1()
	{
		Frame f=new Frame();
		Choice c=new Choice();
		c.setBounds(100,100,75,75);
		c.add("Anjli");
        c.add("Bhoomi");
        c.add("Crystal");
        c.add("Daisy");
        c.add("Ekta");
		f.add(c);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ChoiceExample1();
	}
}