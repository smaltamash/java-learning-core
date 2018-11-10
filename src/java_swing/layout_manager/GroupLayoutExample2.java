package java_swing.layout_manager;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import java.awt.Container;  
public class GroupLayoutExample2
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("GroupLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container myPanel=frame.getContentPane();
		GroupLayout groupLayout=new GroupLayout(myPanel);
		groupLayout.setAutoCreateGaps(true);
		groupLayout.setAutoCreateContainerGaps(true);
		myPanel.setLayout(groupLayout);
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(b1).addComponent(b3)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(b2)));
		groupLayout.setVerticalGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(b1).addComponent(b2)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(b3)));
		frame.pack();
		frame.setVisible(true);		 	  
    }
}  
    