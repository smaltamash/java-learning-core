package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRootPane;
public class JRootPaneExample1
{
    public static void main(String args[])
 	{
		JFrame f=new JFrame("JRootPane Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRootPane root=f.getRootPane();
		//Create a Menu Bar
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("File");
		bar.add(menu);	
		menu.add("Open");
		menu.add("Close");	
		root.setJMenuBar(bar);
		//Adding a Button to the Content Pane
		root.getContentPane().add(new JButton("Press Me"));
		//Display the UI
		f.pack();
		f.setVisible(true);
    }
}