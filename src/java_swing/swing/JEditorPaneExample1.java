package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
public class JEditorPaneExample1
{
	JFrame myframe=null;
	public static void main(String args[])
	{
		(new JEditorPaneExample1()).test();  
	}	
	public void test()	
	{
		myframe=new JFrame("JEditorPane Example");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(400,200);
		JEditorPane mypane=new JEditorPane();
		mypane.setContentType("text/plain");
		mypane.setText("Sleeping is Necessasry for a healthy body"+"but Sleeping in Unnecessary times may destroy our health, wealth and studies."+"Doctors adviced that sleeping at improper times may lead for Obesity during the student days.");
		myframe.setContentPane(mypane);
		myframe.setVisible(true);
	}
}
