package java_swing.layout_manager;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import java.awt.Container;  
public class GroupLayoutExample1
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("GroupLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPanel=frame.getContentPane();
		GroupLayout groupLayout=new GroupLayout(contentPanel);
		contentPanel.setLayout(groupLayout);
		JLabel clickMe=new JLabel("Click Here");	
		JButton button=new JButton("This Button");
		groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup().addComponent(clickMe).addGap(10,20,100).addComponent(button));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(clickMe).addComponent(button));
		frame.pack();
		frame.setVisible(true);		 	  
    }
}  
    