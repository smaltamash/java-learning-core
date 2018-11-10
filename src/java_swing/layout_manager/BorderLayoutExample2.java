package java_swing.layout_manager;
import java.awt.Frame;
import java.awt.Button;
import javax.swing.BoxLayout;
public class BorderLayoutExample2 extends Frame
{
	Button buttons[];
	public BorderLayoutExample2()
	{
		buttons =new Button[5];	
		for(int i=0;i<5;i++)
		{
			buttons[i]=new Button("Button "+(i+1));
			add(buttons[i]);
		}
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		setSize(400,400);
		setVisible(true);	
	}
	public static void main(String[] args)
	{
		BorderLayoutExample2 b=new BorderLayoutExample2();
	}
}