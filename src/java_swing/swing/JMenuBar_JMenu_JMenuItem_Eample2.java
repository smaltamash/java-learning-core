package java_swing.swing;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JMenuBar_JMenu_JMenuItem_Eample2 implements ActionListener
{
	JFrame f;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea ta;
	JMenuBar_JMenu_JMenuItem_Eample2()
	{
		f=new JFrame("MenuBar, Menu and MenuItem Example");
		JMenuBar mb=new JMenuBar();
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("paste");
		selectAll=new JMenuItem("selectAll");
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		mb=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		edit.add(cut);
		edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        ta=new JTextArea();
        ta.setBounds(5,5,360,320);
        f.add(mb);
        f.add(ta);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent	e)
	{
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectAll)
		{
			ta.selectAll();
		}
	}
	public static void main(String args[])
	{
		new JMenuBar_JMenu_JMenuItem_Eample2();
	}
}