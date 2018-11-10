package java_applet.applet;
import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class AppletCommunicationExample extends Applet implements ActionListener
{  
	Button b;  
	public void init()
	{  
		b=new Button("Click");  
		b.setBounds(50,50,60,50);  

		add(b);  
		b.addActionListener(this);  
	}  
	public void actionPerformed(ActionEvent e){  

		AppletContext ctx=getAppletContext();  
		Applet a=ctx.getApplet("app2");  
		a.setBackground(Color.yellow);  
	}  
} 
//It is communication with AppletExample1
//run it in terminal
