package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ButtonExample2
{
	ButtonExample2()
	{
		Frame f=new Frame("Button Example2");
		final TextField tf=new TextField();
		tf.setBounds(50,50,150,20);
		Button b=new Button("Click Me");
		b.setBounds(50,100,60,30);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Hi I am Garima Arora");
			}
		});
		f.add(b);
		f.add(tf); 
		f.setSize(400,400);
		f.setLayout(null); 
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ButtonExample2();
	}
}