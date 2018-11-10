package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//JOptionPane showConfirmDialog()   
public class JOptionPaneExample4 extends WindowAdapter
{
	JFrame f;
	JOptionPaneExample4()
	{
		f=new JFrame();
		f.addWindowListener(this);
		f.setSize(300,300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// DO_NOTHING_ON_CLOSE is very useful
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		int a=JOptionPane.showConfirmDialog(f,"Are you Sure ?");
		if(a==JOptionPane.YES_OPTION)
		{
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	public static void main(String args[])
	{
		new JOptionPaneExample4();
	}
}