package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;
public class JComboBoxExample1  
{
	JFrame f;
	JComboBoxExample1()
	{
		f=new JFrame("Checkbox Example");
		String country[]={"India","Australia","U.S.A","England","NewZeland"};
		//JComboBox<String> cb=new JComboBox<>(country); // This line will work in eclipse and terminal both
		JComboBox cb=new JComboBox(country);// This line will work in eclipse and will work in terminal with some notes after compilation
		cb.setBounds(50,50,90,20);	
		f.add(cb);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new JComboBoxExample1();
	}
}