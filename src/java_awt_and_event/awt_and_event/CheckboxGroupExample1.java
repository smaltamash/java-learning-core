package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
public class CheckboxGroupExample1
{
	CheckboxGroupExample1()
	{
		Frame f=new Frame("CheckboxGroup Example1");
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox checkBox1=new Checkbox("Ruby",cbg,false);
		checkBox1.setBounds(100,100,50,50);
		Checkbox checkBox2=new Checkbox("Scala",cbg,true);
		checkBox2.setBounds(100,150,50,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new CheckboxGroupExample1();
	}
}