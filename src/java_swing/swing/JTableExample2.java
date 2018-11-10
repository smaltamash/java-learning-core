package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
public class JTableExample2  
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Table Example");
		String data[][]={{"101","Aiysha","670000"},{"102","Faiza","780000"},{"103","Shani","700000"}};
		String column[]={"ID","NAME","SALARY"};
		final JTable jt=new JTable(data,column);
		jt.setCellSelectionEnabled(true);
		ListSelectionModel select=jt.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent e)// It will print twice when you will click once because whenever you click two times value is changed and two processes takes place Pressing and Releasing, If you will just press it will print once and then when you will release it will print again. 
			{
				String Data=null;
				int[] row=jt.getSelectedRows();
				int[] columns=jt.getSelectedColumns();
				for(int i=0;i<row.length;i++)
				{
					for(int j=0;j<columns.length;j++)
					{
						Data=(String)jt.getValueAt(row[i],columns[j]);	
					}
				} 
				System.out.println("Table Element Selected is : "+Data);
			}
		});
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300,200);
		f.setVisible(true);
	}
}