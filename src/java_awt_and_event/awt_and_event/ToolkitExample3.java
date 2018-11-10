package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
public class ToolkitExample3
{
	ToolkitExample3()
	{
		Frame f=new Frame();
		Image icon=Toolkit.getDefaultToolkit().getImage("src/java_awt_and_event/awt_and_event/Images/Witcher3.png");
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ToolkitExample3();
	}
}