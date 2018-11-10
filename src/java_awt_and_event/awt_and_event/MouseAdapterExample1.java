package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MouseAdapterExample1 extends MouseAdapter	
{
	Frame f;
	MouseAdapterExample1()
	{
		f=new Frame("MouseAdapter Example1");
		f.addMouseListener(this);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		Graphics g=f.getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(),e.getY(),30,30);
	}
	public static void main(String args[])
	{
		new MouseAdapterExample1();
	}
}