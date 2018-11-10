package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class ItemListenerExample1 implements ItemListener
{
	Checkbox checkBox1,checkBox2;
	Label label;
	ItemListenerExample1()
	{
		Frame f=new Frame("ItemListener Example");
		label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		checkBox1=new Checkbox("C++");
		checkBox1.setBounds(100,100,50,50);
		checkBox2=new Checkbox("Java");
		checkBox2.setBounds(100,150,50,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(label);
		checkBox1.addItemListener(this);
		checkBox2.addItemListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==checkBox1)
		{
			label.setText("C++ Checkbox : "+(e.getStateChange()==1?"Checked":"Unchecked"));
		}
		if(e.getSource()==checkBox2)
		{
			label.setText("Java Checkbox : "+(e.getStateChange()==1?"Checked":"Unchecked"));
		}
	}
	public static void main(String args[])
	{
		new ItemListenerExample1();
	}
}