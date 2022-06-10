import java.awt.*;
import java.awt.event.*;


class swap extends Frame implements ActionListener
{
	Button b1;
	TextField tf1,tf2;
	swap()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("My swap gui");
		setBackground(Color.GRAY);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		tf1=new TextField("Enter first name");
		tf2=new TextField("Enter second name");
		add(tf1);
		add(tf2);
		
		
		b1=new Button("SWAP");
		
		add(b1);
		
		b1.addActionListener(this);
		
		
	}
	
	public static void main(String [] args)
	{
		swap obj=new swap();
	}	
	
	
	public void actionPerformed(ActionEvent e)
	
	{
		String a1=tf1.getText();
		String a2=tf2.getText();
		tf1.setText(a2);
		tf2.setText(a1);
	}	
}	