package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
public class CanvasExample1
{
	public CanvasExample1()
	{
		Frame f=new Frame("Canvas Example1");
		f.add(new MyCanvas());
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new CanvasExample1();
	}
}
class MyCanvas extends Canvas
{
	public MyCanvas()
	{
		setBackground(Color.GRAY);
		setSize(300,200);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(75,75,150,75);
	}
}