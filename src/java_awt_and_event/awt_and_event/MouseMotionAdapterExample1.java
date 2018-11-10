package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
public class MouseMotionAdapterExample1 extends MouseMotionAdapter	
{
	Frame f;
	MouseMotionAdapterExample1()
	{
		f=new Frame("MouseMotionAdapter Example1");
		f.addMouseMotionListener(this);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=f.getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX(),e.getY(),30,30);
	}
	public static void main(String args[])
	{
		new MouseMotionAdapterExample1();
	}
}