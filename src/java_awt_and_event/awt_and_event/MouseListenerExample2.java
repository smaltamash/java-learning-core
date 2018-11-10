package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class MouseListenerExample2 extends Frame implements MouseListener
{
	MouseListenerExample2()
	{
		addMouseListener(this);
		setSize(300,300);
		setLayout(null);	
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		Graphics g=getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(),e.getY(),30,30);
	}
	public void mouseEntered(MouseEvent e)
	{}
	public void mouseExited(MouseEvent e)
	{}
	public void mousePressed(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
	public static void main(String args[])
	{
		new MouseListenerExample2();
	}
}