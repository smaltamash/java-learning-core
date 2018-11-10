package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ToolkitExample2
{
	public static void main(String args[])
	{
		Frame f=new Frame("Toolkit Example2");
		Button b=new Button("Beep");	
		b.setBounds(50,100,60,30);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Toolkit.getDefaultToolkit().beep();	 		
			}
		});
	}
}