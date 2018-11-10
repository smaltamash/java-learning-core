package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//JOptionPane showMessageDialog()   JOptionPane.WARNING_MESSAGE 
public class JOptionPaneExample2  
{
	JOptionPaneExample2()
	{
		JFrame f=new JFrame();
		JOptionPane.showMessageDialog(f,"Successfully Updated","Alert",JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String args[])
	{
		new JOptionPaneExample2();
	}
}