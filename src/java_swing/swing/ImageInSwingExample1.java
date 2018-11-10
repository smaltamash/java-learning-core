package java_swing.swing;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.JFrame;
public class ImageInSwingExample1 extends Canvas
{
	public void paint(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("src/java_swing/swing/Images/Ciri.jpg");
		g.drawImage(i,120,100,this);
	}
	public static void main(String[] args)
	{
		ImageInSwingExample1 m=new ImageInSwingExample1();
		JFrame f=new JFrame();
		f.add(m);
		f.setSize(1500,1000);
		f.setVisible(true);
	}
}