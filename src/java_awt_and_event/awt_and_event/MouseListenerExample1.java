package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class MouseListenerExample1 extends Frame implements MouseListener
{
	Label l;
	MouseListenerExample1()
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(20,50,100,20);
		add(l);
		setSize(300,300);
		setLayout(null);	
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released");
	}
	public static void main(String args[])
	{
		new MouseListenerExample1();
	}
}