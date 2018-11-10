package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class JProgressBarExample1 extends JFrame 
{
	JProgressBar jb;
	int i=0,num=0;
	JProgressBarExample1()
	{
		jb=new JProgressBar(0,2000);
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250,150);
		setLayout(null);
	}
	public void iterate()
	{
		while(i<=2000)
		{
			jb.setValue(i);
			i=i+20;
			try
			{
				Thread.sleep(150);
			}
			catch(Exception e)
			{
				e.printStackTrace(); 	
			}
		}
	}
	public static void main(String args[])
	{
		JProgressBarExample1 m=new JProgressBarExample1();
		m.setVisible(true);
		m.iterate();		
	}
}