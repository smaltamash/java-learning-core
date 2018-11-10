package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//JOptionPane showMessageDialog() 
public class JOptionPaneExample1  
{
	JOptionPaneExample1()
	{
		JFrame f=new JFrame();
		JOptionPane.showMessageDialog(f,"Hello, Welcome to Java Learning.");
	}
	public static void main(String args[])
	{
		new JOptionPaneExample1();
	}
}