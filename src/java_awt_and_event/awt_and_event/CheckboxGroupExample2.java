package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class CheckboxGroupExample2
{
	CheckboxGroupExample2()
	{
		Frame f=new Frame("CheckboxGroup Example2");
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox checkBox1=new Checkbox("C",cbg,false);
		checkBox1.setBounds(100,100,50,50);
		Checkbox checkBox2=new Checkbox("PHP",cbg,false);
		checkBox2.setBounds(100,150,50,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(label);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		checkBox1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("C Checkbox : Checked");
			}
		});
		checkBox2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("Java Checkbox : Checked");
			}
		});
	}
	public static void main(String args[])
	{
		new CheckboxGroupExample2();
	}
}