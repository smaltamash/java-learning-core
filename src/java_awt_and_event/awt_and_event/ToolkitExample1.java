package java_awt_and_event.awt_and_event;
import java.awt.Toolkit;
import java.awt.Dimension;
public class ToolkitExample1
{
	public static void main(String args[])
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		System.out.println("Screen Resolution = "+t.getScreenResolution());
		Dimension d=t.getScreenSize();
		System.out.println("Screen Width = "+d.width);
		System.out.println("Screen Height = "+d.height);
	}
}