import java.awt.*;

class some_component
{
	public static void main(String [] args)
	{
		Frame f=new Frame();
		f.setSize(300,300);
		f.setVisible(true);
		f.setTitle("MY FRAME");
		f.setLocation(50,100);//used to set the frame location on the window
		f.setBounds(100,200,700,500);//horizontal marzin,vertical marzin,breadth of the frame,height of the frame
		//this is the combinatio of both setSize and setLocation
		f.setBackground(Color.GREEN);
		//f.resize(900,500);//use to resize the frame
		
		System.out.println(f.isVisible());
		
		
	}
}	