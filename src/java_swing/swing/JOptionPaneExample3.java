package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//JOptionPane showInputDialog()   
public class JOptionPaneExample3  
{
	JOptionPaneExample3()
	{
		JFrame f=new JFrame();
		JOptionPane.showInputDialog(f,"Enter Name");
	}
	public static void main(String args[])
	{
		new JOptionPaneExample3();
	}
}