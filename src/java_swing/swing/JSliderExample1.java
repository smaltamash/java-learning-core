package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
public class JSliderExample1 extends JFrame
{
	public JSliderExample1()
	{
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);	
	}
	public static void main(String args[])
	{
		JSliderExample1 frame=new JSliderExample1();
		frame.pack();
		frame.setVisible(true);
	}
}