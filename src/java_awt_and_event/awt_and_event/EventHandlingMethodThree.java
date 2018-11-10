package java_awt_and_event.awt_and_event;
//Event Handling code in Anonymous Class
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class EventHandlingMethodThree extends Frame	
{
	TextField tf;
	EventHandlingMethodThree()
	{
		//Create Components
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Click Me");
		b.setBounds(100,120,80,30);
		//Registering Listener
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Hello");
			}
		}); 
		//Add components and set size,layout and visibility
		add(b); 
		add(tf);
		setSize(300,300);
		setLayout(null); 
		setVisible(true);
	}
	public static void main(String args[])
	{
		new EventHandlingMethodThree();
	}
}