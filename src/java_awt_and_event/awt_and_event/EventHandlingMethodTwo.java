package java_awt_and_event.awt_and_event;
//Event Handling code in Outer Class(Other Class)
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Outer implements ActionListener
{
	EventHandlingMethodTwo obj;
	Outer(EventHandlingMethodTwo obj)
	{
		this.obj=obj;
	}
	public void actionPerformed(ActionEvent e)
	{
		obj.tf.setText("Welcome");
	}
}
public class EventHandlingMethodTwo extends Frame	
{
	TextField tf;
	EventHandlingMethodTwo()
	{
		//Create Components
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Click Me");
		b.setBounds(100,120,80,30);
		//Registering Listener
		Outer o=new Outer(this);
		b.addActionListener(o); //Passing outer class instance
		//Add components and set size,layout and visibility
		add(b); 
		add(tf);
		setSize(300,300);
		setLayout(null); 
		setVisible(true);
	}
	public static void main(String args[])
	{
		new EventHandlingMethodTwo();
	}
}