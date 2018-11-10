package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class JProgressBarExample2 extends JFrame 
{
	JProgressBar jb;
	int i=0,num=0;
	JProgressBarExample2()
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
		int j=0;
		while(i<=2000)
		{
			jb.setString("Loading "+(j++)+"%");
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
		JProgressBarExample2 m=new JProgressBarExample2();
		m.setVisible(true);
		m.iterate();		
	}
}