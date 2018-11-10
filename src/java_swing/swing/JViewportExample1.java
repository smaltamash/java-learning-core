package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;	
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
public class JViewportExample1
{
	public static void main(String args[])
	{
		JFrame myframe=new JFrame("JViewport Example");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label=new JLabel();
		label.setPreferredSize(new Dimension(1000,1000));
		JScrollPane jScrollPane=new JScrollPane(label);
		JButton button=new JButton("File");
		jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPane.setViewportBorder(new LineBorder(Color.RED));
		jScrollPane.getViewport().add(button,null);
		myframe.add(jScrollPane,BorderLayout.CENTER);	
		myframe.setSize(400,150);
		myframe.setVisible(true);  
	}
}