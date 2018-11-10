package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Label;
public class LabelExample1
{
	LabelExample1()
	{
		Frame f=new Frame("Label Example1");
		Label l1,l2;
		l1=new Label("Amyra Arora");
		l1.setBounds(50,100,100,30);
		l2=new Label("Karishma Khan");
		l2.setBounds(50,150,100,30);
		f.add(l1);
		f.add(l2); 
		f.setSize(400,400);
		f.setLayout(null); 
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new LabelExample1();
	}
}