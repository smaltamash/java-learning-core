package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
public class PanelExample1
{
	public PanelExample1()
	{
		Frame f=new Frame("Panel Example1");
		Panel panel=new Panel();
		panel.setBounds(40,80,200,200);
		panel.setBackground(Color.GRAY);
		Button b1=new Button("Button 1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.YELLOW);
		Button b2=new Button("Button 2");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.green);
		panel.add(b1);
		panel.add(b2);
		f.add(panel);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new PanelExample1();
	}
}