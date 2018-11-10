package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
public class JSliderExample2 extends JFrame
{
	public JSliderExample2()
	{
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);	
		slider.setPaintLabels(true);
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);	
	}
	public static void main(String args[])
	{
		JSliderExample2 frame=new JSliderExample2();
		frame.pack();
		frame.setVisible(true);
	}
}