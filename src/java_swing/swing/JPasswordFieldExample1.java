package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField; 
public class JPasswordFieldExample1 
{
	JPasswordFieldExample1()
	{
		JFrame f=new JFrame("PasswordField Example");
		JPasswordField value=new JPasswordField();
		JLabel l1=new JLabel("Password : ");
		l1.setBounds(20,100,80,30);
		value.setBounds(100,100,100,30);
		f.add(value);
		f.add(l1);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JPasswordFieldExample1();
	}
}