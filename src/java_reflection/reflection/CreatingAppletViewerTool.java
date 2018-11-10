package java_reflection.reflection;
import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
public class CreatingAppletViewerTool extends Frame
{
	public static void main(String args[])throws Exception
	{
		Class c=Class.forName(args[0]);
		CreatingAppletViewerTool p=new CreatingAppletViewerTool();
		p.setSize(400,400);
		p.setLayout(null);
		p.setVisible(true);
		Applet a=(Applet)c.newInstance();
		a.start();
		Graphics g=p.getGraphics();
		a.paint(g);
		a.stop();
	}
}