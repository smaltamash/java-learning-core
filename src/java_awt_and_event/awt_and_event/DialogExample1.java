package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Dialog;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout; 
public class DialogExample1
{
	public static Dialog d;	
	public DialogExample1()
	{
		Frame f=new Frame();
		d=new Dialog(f,"Dialog Example1",true);
		d.setLayout(new FlowLayout());
		Button b=new Button("OK");
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DialogExample1.d.setVisible(false);
			}
		});
		d.add(new Label("Click Button to Continue."));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
	}
	public static void main(String args[])
	{
		new DialogExample1();
	}
}