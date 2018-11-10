package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.List;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ListExample2
{
	ListExample2()
	{
		Frame f=new Frame();
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(500,100);
		Button b=new Button("Show");
		b.setBounds(200,150,80,30);
		final List l1=new List(5,false); //false means you can select only one from list, by default it is false
		l1.setBounds(100,100,70,70);
		l1.add("Queren");
        l1.add("Reema");
        l1.add("Seema");
        l1.add("Taniya");
        l1.add("Uzma");
        final List l2=new List(5,true); //true means you can select multiple from list, by default it is false
        l2.setBounds(100,200,70,70);
		l2.add("Queensland");
        l2.add("Romania");
        l2.add("Switzerland");
        l2.add("Tibet");
        l2.add("Uzbekistan");
		f.add(l1);
		f.add(l2);
		f.add(label);
		f.add(b);
		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String data="Name : "+l1.getItem(l1.getSelectedIndex());
				data+=", Palce Selected : ";
				for(String frame:l2.getSelectedItems())
				{
					data+=frame+" ";
				}
				label.setText(data);
			}
		});
	}
	public static void main(String args[])
	{
		new ListExample2();
	}
}