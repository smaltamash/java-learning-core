package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
public class ToolTipExample1
{
    public static void main(String args[])
 	{
		JFrame f=new JFrame("Tool Tip Example");
		//Creating Password Field and Label
		JPasswordField value=new JPasswordField();
		value.setBounds(100,100,100,30);
		value.setToolTipText("Enter Your Password");
		JLabel l1=new JLabel("Password : ");
		l1.setBounds(20,100,80,30);
		//Adding Components to Frame
		f.add(value);
		f.add(l1);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);	
    }
}