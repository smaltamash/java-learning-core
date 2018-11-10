package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.TextField;
public class TextFieldExample1
{
	public static void main(String args[])
	{
		Frame f=new Frame("TextField Example1");
		TextField tf1,tf2;
		tf1=new TextField("Welcome To Java Learning");
		tf1.setBounds(50,100,200,30);
		tf2=new TextField("Learning AWT");
		tf2.setBounds(50,150,200,30);
		f.add(tf1);
		f.add(tf2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}