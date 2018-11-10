package java_applet.applet;
import java.awt.*;  
import java.applet.*;  
public class AnimationApplet extends Applet 
{  
	Image picture;  
	public void init() 
	{  
		//picture =getImage(getDocumentBase(),"Bike1.jpeg");  
		picture =getImage(getDocumentBase(),"Ciri3.png");  
	}  
	public void paint(Graphics g) 
	{  
		for(int i=0;i<500;i++){  
			g.drawImage(picture, i,30, this);  
			try{Thread.sleep(100);}catch(Exception e){}  
		}  
	}  
}  