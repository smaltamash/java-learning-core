package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class JCheckBoxExample2 
{
	JCheckBoxExample2()
	{
		JFrame f=new JFrame("CheckBox Example");
		final JLabel label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		JCheckBox checkBox1=new JCheckBox("C++");
		checkBox1.setBounds(100,100,80,50);
		JCheckBox checkBox2=new JCheckBox("Java",true);
		checkBox2.setBounds(100,150,80,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(label);
		checkBox1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("C++ Checkbox : "
					+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		checkBox2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("Java Checkbox : "
					+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true); 
	}
	public static void main(String args[])
	{
		new JCheckBoxExample2();
	}
}