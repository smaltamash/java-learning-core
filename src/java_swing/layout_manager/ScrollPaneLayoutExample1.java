package java_swing.layout_manager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Container;  
public class ScrollPaneLayoutExample1 extends JFrame
{
	public ScrollPaneLayoutExample1()
	{
		super("ScrollPane Example");
		ImageIcon img=new ImageIcon("/home/auzad/Desktop/Java Swing Files/Ciri_And_Dragon.jpg");
		JScrollPane png=new JScrollPane(new JLabel(img));
		getContentPane().add(png);
		setSize(300,250); 	 	 	
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new ScrollPaneLayoutExample1();		 	  
    }
}