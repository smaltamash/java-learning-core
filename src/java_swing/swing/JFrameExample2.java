package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
// Creating Frame by importing JFrame Class(Association) using Constructor
public class JFrameExample2
{
	JFrame f;
	JFrameExample2()
	{
		f=new JFrame(); //creating instance of JFrame
		JButton b=new JButton("click"); //creating instance of JButton
		b.setBounds(130,100,100,40); //x axis, y axis, width, height
		f.add(b); //adding button in JFrame
		f.setSize(400,500); //400 width and 500 height
		f.setLayout(null); //using no layout managers
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JFrameExample2();
	}
}