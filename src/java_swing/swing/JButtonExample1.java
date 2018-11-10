package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
public class JButtonExample1 extends JFrame 
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton("Click Here");
		b.setBounds(50,100,95,30);
		f.add(b);
		f.setSize(400,400);
		f.setVisible(true);
	}
}