/* border layout 
by using this we can divide frame in to 5 regions north,south,east,west,centre*/

import java.awt.*;
import java.awt.event.*;
class border extends Frame
{
	private Panel east,west,north,south,center;
	border()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("border");
		BorderLayout layout = new BorderLayout(10,20);
		setLayout(layout);
		
		
		//we can also set the gap 
		layout.setHgap(20);
		layout.setVgap(50);
		east=new Panel();
		west=new Panel();
		north=new Panel();
		south=new Panel();
		center=new Panel();
		
		//east.setPreferredSize(new Dimension(200,500));
		
		
		east.setBackground(Color.BLUE);
		west.setBackground(Color.YELLOW);
		north.setBackground(Color.GREEN);
		south.setBackground(Color.PINK);
		center.setBackground(Color.RED);
		
		add(east,layout.EAST);
		add(west,layout.WEST);
		add(north,layout.NORTH);
		add(south,layout.SOUTH);
		add(center,layout.CENTER);
		
	}
	
	public static void main(String[] args)
	{
		border obj=new border();
	}
}	