package java_swing.layout_manager;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Button;
import java.awt.ComponentOrientation;
import java.awt.Insets;
import java.awt.Container;
public class GridBagLayoutExample2 extends JFrame
{
	final static boolean shouldFill=true;
    final static boolean shouldWeightX=true;
    final static boolean RIGHT_TO_LEFT=false;	
	public static  void addComponentsToPane(Container pane)
	{
		if(RIGHT_TO_LEFT)
		{
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}	
		JButton button;
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		if(shouldFill)
		{
			//Natural Height, Maximum Width
			c.fill=GridBagConstraints.HORIZONTAL;
		}
		button=new JButton("Button 1");
		if(shouldWeightX)
		{
			c.weightx=0.5;
		}
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		pane.add(button,c);
		button=new JButton("Button 2");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.weightx=0.5;
		c.gridx=1;
		c.gridy=0;
		pane.add(button,c);
		button=new JButton("Button 3");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.weightx=0.5;
		c.gridx=2;
		c.gridy=0;
		pane.add(button,c);
		button=new JButton("Long-Named Button 4");
		c.fill=GridBagConstraints.HORIZONTAL;	
		c.ipady=40; //Make this Component tall
		c.weightx=0.0;
		c.gridwidth=3;
		c.gridx=0;c.gridy=1;
		pane.add(button,c);
		button=new JButton("5");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.ipady=0; //reset to default
		c.weighty=1.0; //request any extra vertical space
		c.anchor=GridBagConstraints.PAGE_END; //bottom of space
		c.insets=new Insets(10,0,0,0); //top padding 
		c.gridx=1; //aligned with button 2
		c.gridwidth=2; //2columns wide
		c.gridy=2; //third row
		pane.add(button,c);	
	}
	private static void createAndShowGUI()
	{
		//Create and set up the Window
		JFrame frame=new JFrame("GridBagLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set up the content pane
		addComponentsToPane(frame.getContentPane());
		//display the Window
		frame.pack();
		frame.setVisible(true);	
	}
	public static void main(String[] args)
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