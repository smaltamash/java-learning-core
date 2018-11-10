package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
public class JFileChooserExample1 extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file;
	JMenuItem open;
	JTextArea ta;
	JFileChooserExample1()
	{
		open =new JMenuItem("Open File");
		open.addActionListener(this);
		file=new JMenu("File");
		file.add(open);
		mb=new JMenuBar();
		mb.setBounds(0,0,800,20);
		mb.add(file);
		ta=new JTextArea(800,800);
		ta.setBounds(0,20,800,800);
		add(mb);
		add(ta);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==open)
		{
			JFileChooser fc=new JFileChooser();
			int i=fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION)
			{
				File f=fc.getSelectedFile();
				String filepath=f.getPath();
				try
				{
					BufferedReader br=new BufferedReader(new FileReader(filepath));	
					String s1="",s2="";
					while((s1=br.readLine())!=null)
					{
						s2+=s1+"\n";
					}
					ta.setText(s2);
					br.close();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
	public static void main(String args[])
	{
		JFileChooserExample1 om=new JFileChooserExample1();
		om.setSize(500,500);	
		om.setLayout(null);	
		om.setVisible(true);
		om.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
	}
}