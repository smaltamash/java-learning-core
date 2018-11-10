package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JRadioButtonExample3 extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2;
	JButton b;
	JRadioButtonExample3()
	{
		rb1=new JRadioButton("A) Male");
		rb2=new JRadioButton("B) Feamle");
		rb1.setBounds(100,50,100,30);
		rb2.setBounds(100,100,100,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b=new JButton("click");
		b.setBounds(100,150,80,30);
		b.addActionListener(this);
		add(rb1);
		add(rb2);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(rb1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are Male");
		}
		if(rb2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are Female");
		}
	}
	public static void main(String args[])
	{
		new JRadioButtonExample3();
	}
}