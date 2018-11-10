package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.Label;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
public class ScrollbarExample2
{
	public ScrollbarExample2()
	{
		Frame f=new Frame("Scrollbar Example2");
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		final Scrollbar s=new Scrollbar();
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
				label.setText("Vertical Scrollbar Value is : "+s.getValue());
			}
		});
	}
	public static void main(String args[])
	{
		new ScrollbarExample2();
	}
}