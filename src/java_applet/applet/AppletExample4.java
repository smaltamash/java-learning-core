package java_applet.applet;
import java.awt.*;  
import java.applet.*;  
public class AppletExample4 extends Applet 
{  
	Image picture;  
	public void init() 
	{  
		picture = getImage(getDocumentBase(),"Ciri2.jpeg");  
	}  
	public void paint(Graphics g) 
	{  
		g.drawImage(picture, 30,30, this);  
	}  
}  
