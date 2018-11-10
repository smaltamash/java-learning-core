package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ActionListenerExample
{
	public static void main(String args[])
	{
		Frame f=new Frame("Action Listener Example1");
		final TextField tf=new TextField();
		tf.setBounds(50,50,150,20);
		Button b=new Button("Click Here");
		b.setBounds(50,100,60,30);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Welcome To Java Learning");
			}
		});  
		f.add(b);
		f.add(tf);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
}