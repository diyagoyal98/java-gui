/* first of all we have to create a frame and to do so we are havingb a inbuilt class in java and we can use this class function in 2 ways by extending the class and by creating the object*/

import java.awt.*;
class frame1 extends Frame
{
	/*frame1(String name)
	{
		super(name);
		setSize(400,300);
		setVisible(true);
		
	}*/
	frame1()
	{
		setSize(300,300);
		setVisible(true);
		setTitle("MY frame");
	}	
	
	public static void main(String [] args)
	{
		//frame1 obj=new frame1("My frame");
		frame1 obj=new frame1();
		
	}
}

