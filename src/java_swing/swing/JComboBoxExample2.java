package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JComboBoxExample2  
{
	JFrame f;
	JComboBoxExample2()
	{
		f=new JFrame("Checkbox Example");
		final JLabel label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		JButton b=new JButton("Show");
		b.setBounds(200,100,75,20);
		String languages[]={"C","C++","C#","Java","PHP"};
		final JComboBox<String> cb=new JComboBox<>(languages);
		cb.setBounds(50,100,90,20);
		f.add(cb);
		f.add(label);
		f.add(b);
		f.setLayout(null);
		f.setSize(350,350);
		f.setVisible(true);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String data="Programming Languages Selected :"
				+cb.getItemAt(cb.getSelectedIndex());
				label.setText(data); 
			}
		});
	}
	public static void main(String args[])
	{
		new JComboBoxExample2();
	}
}