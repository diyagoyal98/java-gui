//check box
import java.awt.*;
import java.awt.event.*;
class checkboxex extends Frame
{
	public static void main(String[] args)
	{
		checkboxex ch=new checkboxex();
		ch.addWindowListener(new MyWindowListener());
	}
	
	checkboxex()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("border");
	}
}

class MyWindowListener implements WindowListener
{	
	public void windowActivated(WindowEvent e){};
	public void windowDeactivated(WindowEvent e){};	
	public void windowOpened(WindowEvent e){};	
	public void windowIconified(WindowEvent e){};	
	public void windowDeiconfied(WindowEvent e){};	
	public void windowClosed(WindowEvent e){};	
	
	public void windowClosing(WindowEvent e){
			System.out.println("Window is closing");
			e.getWindow().dispose();
	}		
}		