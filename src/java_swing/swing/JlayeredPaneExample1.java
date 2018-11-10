package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;	
public class JlayeredPaneExample1 extends JFrame
{
	public JlayeredPaneExample1()
	{
		super("LayeredPane Example");
		setSize(200,200);
		JLayeredPane pane=getLayeredPane();
		//creating buttons
		JButton top=new JButton();
		top.setBackground(Color.WHITE);
		top.setBounds(20,20,50,50);
		JButton middle=new JButton();
		middle.setBackground(Color.RED);
		middle.setBounds(40,40,50,50);
		JButton bottom=new JButton();
		bottom.setBackground(Color.CYAN);
		bottom.setBounds(60,60,50,50);
		//adding buttons on pane
		pane.add(bottom,new Integer(1));
		pane.add(middle,new Integer(2));
		pane.add(top,new Integer(3));
	}
	public static void main(String args[])
	{
		JlayeredPaneExample1 panel=new JlayeredPaneExample1();
		panel.setVisible(true);  
	}
}