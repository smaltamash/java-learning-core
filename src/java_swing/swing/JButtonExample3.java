package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
public class JButtonExample3
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton(new ImageIcon("src/java_swing/swing/Images/PSP.png"));
		b.setBounds(50,100,580,250);
		f.add(b);
		f.setSize(680,450);
		f.setLayout(null);
		f.setVisible(true);
	}
}