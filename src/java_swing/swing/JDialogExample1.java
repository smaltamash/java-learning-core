package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JDialogExample1
{
	private static JDialog d;
	JDialogExample1()
	{
		JFrame f=new JFrame();
		d=new JDialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		JButton b=new JButton("OK");
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialogExample1.d.setVisible(false);	
			}
		});
		d.add(new JLabel("Click Button to Continue."));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
	}
	public static void main(String args[])
	{
		new JDialogExample1(); 
	}
}