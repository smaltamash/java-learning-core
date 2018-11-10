package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
public class JPanelExample1
{
	JPanelExample1()
	{
		JFrame f=new JFrame("Panel Example");
		JPanel panel=new JPanel();
		panel.setBounds(40,80,200,200);
		panel.setBackground(Color.GRAY);
		JButton b1=new JButton("Button 1");	
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.yellow);
		JButton b2=new JButton("Button 2");
		b2.setBounds(100,100,80,30);	
		b2.setBackground(Color.green);
		panel.add(b1);
		panel.add(b2);
		f.add(panel);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JPanelExample1(); 
	}
}