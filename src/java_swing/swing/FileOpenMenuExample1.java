package java_swing.swing;
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
import java.io.*;  
public class FileOpenMenuExample1 extends JFrame implements ActionListener
{  
	JMenuBar mb;  
	JMenu file;  
	JMenuItem open;  
	JTextArea ta;  
	FileOpenMenuExample1()
	{  
		open=new JMenuItem("Open File");  
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
			openFile();  
		}  
	}  
	void openFile()
	{  
		JFileChooser fc=new JFileChooser();  
		int i=fc.showOpenDialog(this);            
		if(i==JFileChooser.APPROVE_OPTION)
		{  
			File f=fc.getSelectedFile();  
			String filepath=f.getPath();  
			displayContent(filepath);             
		}            
	}  
	void displayContent(String fpath)
	{  
		try
		{  
			BufferedReader br=new BufferedReader(new FileReader(fpath));  
			String s1="",s2="";                
			while((s1=br.readLine())!=null)
			{  
				s2+=s1+"\n";  
			}  
			ta.setText(s2);  
			br.close();  
		}
		catch (Exception e) 
		{
			e.printStackTrace();  
		}  
	}    
	public static void main(String[] args) 
	{  
		FileOpenMenuExample1 om=new FileOpenMenuExample1();  
		om.setSize(800,800);  
		om.setLayout(null);  
		om.setVisible(true);  
		om.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}  
}  