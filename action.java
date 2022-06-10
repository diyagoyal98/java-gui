import java.awt.*;
import java.awt.event.*;

class action extends Frame
{
	Button b1;
	action()
	{
		setSize(400,400);
		setVisible(true);
		setTitle("My frame");
		
		FlowLayout layout=new FlowLayout();
		setLayout(layout);
		
		b1=new Button("hii i am hehehhe");
		
		b1.addActionListener(new MyActionListner());
		
		
		add(b1);
	}
	
	public static void main(String [] args)
	{
		action obj=new action();
	}
}

class MyActionListner implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked ");
	}
}	
		