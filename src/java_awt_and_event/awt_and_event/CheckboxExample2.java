package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class CheckboxExample2
{
	CheckboxExample2()
	{
		Frame f=new Frame("Checkbox Example2");
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		Checkbox checkBox1=new Checkbox("Pearl");
		checkBox1.setBounds(100,100,50,50);
		Checkbox checkBox2=new Checkbox("C++");
		checkBox2.setBounds(100,150,50,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(label);
		checkBox1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("Pearl Checkbox : "+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		checkBox2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("C++ Checkbox : "+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new CheckboxExample2();
	}
}