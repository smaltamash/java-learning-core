package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
public class JListExample1  
{
	JListExample1()
	{
		JFrame f=new JFrame();
		//DefaultListModel<String> l1=new DefaultListModel<String>();
		DefaultListModel<String> l1=new DefaultListModel<>(); //this is correct and even above is correct
		l1.addElement("Item 1");
		l1.addElement("Item 2");
		l1.addElement("Item 3");
		l1.addElement("Item 4");
		JList<String> list=new JList<>(l1);
		list.setBounds(100,100,75,75);
		f.add(list);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JListExample1();
	}
}