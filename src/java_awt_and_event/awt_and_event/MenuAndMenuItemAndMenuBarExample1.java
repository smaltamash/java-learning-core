package java_awt_and_event.awt_and_event;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
public class MenuAndMenuItemAndMenuBarExample1
{
	public MenuAndMenuItemAndMenuBarExample1()
	{
		Frame f=new Frame("Menu and MenuItem and MenuBar Example1");
		MenuBar mb=new MenuBar();
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("Sub Menu");
		MenuItem i1=new MenuItem("Samsung");
		MenuItem i2=new MenuItem("Dell");
		MenuItem i3=new MenuItem("Microsoft");
		MenuItem i4=new MenuItem("Apple iPhone");
		MenuItem i5=new MenuItem("Apple MacBook Pro");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new MenuAndMenuItemAndMenuBarExample1();
	}
}