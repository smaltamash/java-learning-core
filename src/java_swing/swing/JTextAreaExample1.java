package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class JTextAreaExample1 
{
	JTextAreaExample1()
	{
		JFrame f=new JFrame();
		JTextArea area=new JTextArea("Welcome to Java Leraning");
		area.setBounds(10,30,200,200);
		f.add(area);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JTextAreaExample1();
	}
}