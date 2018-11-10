package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
// Creating Frame by extending JFrame Class(Inheritance)
public class JFrameExample3 extends JFrame //Inheriting JFrame
{
	JFrameExample3()
	{
		JButton b=new JButton("click"); //creating instance of JButton
		b.setBounds(130,100,100,40); //x axis, y axis, width, height
		add(b); //adding button in JFrame
		setSize(400,500); //400 width and 500 height
		setLayout(null); //using no layout managers
		setVisible(true);
	}
	public static void main(String args[])
	{
		new JFrameExample3();
	}
}