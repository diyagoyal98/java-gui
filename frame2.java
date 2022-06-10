// using object creation
import java.awt.*;

class frame2
{
	frame2()
	{
		Frame f =new Frame();
		f.setSize(400,500);
		f.setVisible(true);
		/*f.addwindowListener(new WindowAdapater())
		{
			public void windowClosing(WindowsEvent e)
			{
				super.windowClosing(0);
			}
				
		}*/
	}	
	public static void main(String [] args)
	{
		frame2 obj=new frame2();
				
	}
}		