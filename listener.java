import java.awt.*;
import java.awt.event.*;

class listener extends Frame
{
	listener()
	{	
		setSize(500,500);
		setVisible(true);
		setTitle("border");
	}
	
	public static void main(String [] args)
	{
		listener obj=new listener();
		obj.addWindowListener(new MyWindow());	
	}
}	

class MyWindow implements WindowListener
{
			public void windowActivated(WindowEvent ev)
			{
				System.out.println("Window is activated ");
			}
			public void windowDeactivated(WindowEvent ev)
			{
				System.out.println("Window is dd ");
			}
			public void windowOpened(WindowEvent ev)
			{
				System.out.println("Window is oo ");
			}
			public void windowIconfield(WindowEvent ev)
			{
				System.out.println("Window is ii ");
			}
			public void windowDeiconfield(WindowEvent ev)
			{
				System.out.println("Window is dd ");
			}
			public void windowClosed(WindowEvent ev)
			{
				System.out.println("Window is cc ");
			}
			public void windowClosing(WindowEvent ev)
			{
				System.out.println("Window is ccing ");
			}
}