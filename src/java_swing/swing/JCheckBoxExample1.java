package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
public class JCheckBoxExample1 
{
	JCheckBoxExample1()
	{
		JFrame f=new JFrame("CheckBox Example");
		JCheckBox checkBox1=new JCheckBox("C++");
		checkBox1.setBounds(100,100,80,50);
		JCheckBox checkBox2=new JCheckBox("Java",true);
		checkBox2.setBounds(100,150,80,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true); 
	}
	public static void main(String args[])
	{
		new JCheckBoxExample1();
	}
}