package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTableExample1  
{
	JFrame f;
	JTableExample1()
	{
		f=new JFrame();
		String data[][]={{"101","Anjli","670000"},{"102","Rashika","780000"},{"103","Sachin","700000"}};
		String column[]={"ID","NAME","SALARY"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JTableExample1();
	}
}