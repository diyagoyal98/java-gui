import java.awt.*;
import java.awt.event.*;

class action2 extends Frame implements ActionListener
{
	Button b1;
	Button b2;
	action2()
	{
		setSize(400,400);
		setVisible(true);
		setTitle("My frame");
		b1=new Button("Click me");
		b2=new Button("Another button");
		FlowLayout layout=new FlowLayout();
		setLayout(layout);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(b1);
		add(b2);
		
	}
	
	public static void main(String [] args)
	{
		action2 obj=new action2();
	}
		public void actionPerformed(ActionEvent e)
	{	
		//System.out.println(e.getSource());
		
		
		Object source=e.getSource();
		if(source==b1)
		{
			System.out.println("Clicked ");
		}
		else
		{
			System.out.println("Second clicked ");	
		}	
	}
}

	
