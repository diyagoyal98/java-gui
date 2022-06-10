import java.awt.*;
import java.awt.event.*;

class calculator extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	TextField tf1,tf2,tf3;
	calculator()
	{
		setSize(400,500);
		setVisible(true);
		setTitle("My calculator");
		setBackground(Color.GRAY);
		
		FlowLayout layout=new FlowLayout();
		setLayout(layout);
		
		tf1=new TextField("Enter number 1");
		tf2=new TextField("Enter number 2");
		tf3=new TextField("Result");
		
		
		b1=new Button("Add +");
		b2=new Button("Sub -");
		b3=new Button("Div /");
		b4=new Button("Mul *");
		b5=new Button("Clr C");
		
		add(tf1);
		add(tf2);
		add(tf3);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		
	}
	
	public static void main(String [] args)
	{
		calculator obj=new calculator();
	}	
	

	public void actionPerformed(ActionEvent e)
	
	{
		Object s=e.getSource();

		if(s==b1)
		{
			int a,b,c;
			
			a=Integer.valueOf(tf1.getText());
			b=Integer.valueOf(tf2.getText());
			c=a+b;
			tf3.setText(String.valueOf(c));
		}
		else if(s==b2)
		{
			int a,b,c;
			a=Integer.valueOf(tf1.getText());
			b=Integer.valueOf(tf2.getText());
			c=a-b;
			tf3.setText(String.valueOf(c));
		}
		else if(s==b3)
		{
			int a,b,c;
			a=Integer.valueOf(tf1.getText());
			b=Integer.valueOf(tf2.getText());
			c=a/b;
			tf3.setText(String.valueOf(c));	
		}
		else if(s==b4)
		{
			int a,b,c;
			a=Integer.valueOf(tf1.getText());
			b=Integer.valueOf(tf2.getText());
			c=a*b;
			tf3.setText(String.valueOf(c));	
		}	
		else
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}	
	
}	
		
		
		