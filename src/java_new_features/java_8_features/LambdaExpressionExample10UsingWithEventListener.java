package java_new_features.java_8_features;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
public class LambdaExpressionExample10UsingWithEventListener
{
	public static void main(String[] args)
	{
		JTextField tf=new JTextField();
		tf.setBounds(50,50,150,20);
		JButton b=new JButton("click");
		b.setBounds(80,100,70,30);
		//Lambda Expression implementing here
		b.addActionListener(e->{
			tf.setText("Hello Swing");
		});
		JFrame f=new JFrame();
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		f.setLayout(null);
		f.setSize(300,200);
		f.setVisible(true);
	}
}