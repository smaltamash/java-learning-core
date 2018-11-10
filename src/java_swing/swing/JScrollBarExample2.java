package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
public class JScrollBarExample2
{
	JScrollBarExample2()
	{
		JFrame f=new JFrame("ScrollBar Example");
		final JLabel label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		final JScrollBar s=new JScrollBar();
		s.setBounds(100,100,50,100);
		f.add(s);
		f.add(label);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		s.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e)
			{
				label.setText("Vertical ScrollBar value is : "+s.getValue());
			}
		});
	}
	public static void main(String args[])
	{
		new JScrollBarExample2();
	}
}