package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class MouseMotionListenerExample1 extends Frame implements MouseMotionListener
{
	MouseMotionListenerExample1()
	{
		addMouseMotionListener(this);
		setSize(300,300);
		setLayout(null);	
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(),e.getY(),20,20);
	}
	public void mouseMoved(MouseEvent e)
	{}
	public static void main(String args[])
	{
		new MouseMotionListenerExample1();
	}
}