package java_swing.swing;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JLabelExample2 extends Frame implements ActionListener
{
	JTextField tf;
	JLabel l;
	JButton b;
	JLabelExample2()
	{
		tf=new JTextField();
		tf.setBounds(50,50,150,20);
		l=new JLabel();
		l.setBounds(50,100,250,20);
		b=new JButton("Find IP");
		b.setBounds(50,150,95,30);
		b.addActionListener(this);
		add(b);
		add(tf);
		add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String host=tf.getText();
			String ip=java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of "+host+" is: "+ip);	
		}
		catch(Exception ex) //If you use e it will say variable e is already defined in actionPerformed() and catch is inside actionPerformed(), Scope of variable is needed here(local variable), If you use e outside actionPerformed() it will work.
		{
			System.out.println(ex);
		}
	}
	public static void main(String args[])
	{
		new JLabelExample2();
	}
}