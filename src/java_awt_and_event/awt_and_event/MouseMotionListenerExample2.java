package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class MouseMotionListenerExample2 extends Frame implements MouseMotionListener
{
	Label l;
	Color c=Color.BLUE;
	MouseMotionListenerExample2()
	{
		l=new Label();
		l.setBounds(20,40,100,20);
		add(l);
		addMouseMotionListener(this);
		setSize(400,400);
		setLayout(null);	
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
		l.setText("X = "+e.getX()+"Y = "+e.getY());
		Graphics g=getGraphics();
		g.setColor(Color.RED);
		g.fillOval(e.getX(),e.getY(),20,20);
	}
	public void mouseMoved(MouseEvent e)
	{
		l.setText("X = "+e.getX()+"Y = "+e.getY());
	}
	public static void main(String args[])
	{
		new MouseMotionListenerExample2();
	}
}