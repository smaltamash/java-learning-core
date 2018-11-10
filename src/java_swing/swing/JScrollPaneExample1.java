package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
public class JScrollPaneExample1
{
	private static final long serialVersionUID=1L;
	private static void createAndShowGUI()	
	{
		//Create and setup the Window
		final JFrame frame=new JFrame("JScrollPane Example");
		//Display the Window
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set FlowLayout for the frame
		frame.getContentPane().setLayout(new FlowLayout());
		JTextArea textArea=new JTextArea(20,20);
		JScrollPane scrollableTextArea=new JScrollPane(textArea);
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollableTextArea);		
	}
	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				createAndShowGUI();
			}
		});  
	}	
}
