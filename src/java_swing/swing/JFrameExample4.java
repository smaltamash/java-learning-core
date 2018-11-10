package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;	
import java.awt.FlowLayout;
public class JFrameExample4
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame("JFrame Example");
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label=new JLabel("JFrame Example Code");
		JButton button=new JButton();
        button.setText("Button");	
        panel.add(label);	
        panel.add(button);
        frame.add(panel);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);  
	}
}