package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.List;
public class ListExample1
{
	ListExample1()
	{
		Frame f=new Frame();
		List l1=new List(5);
		l1.setBounds(100,100,75,75);
		l1.add("Lisa");
        l1.add("Mariyam");
        l1.add("Nita");
        l1.add("Olli");
        l1.add("Payal");
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ListExample1();
	}
}