//label

import java.awt.*;
import java.awt.event.*;
class label extends Frame
{
	Button b1;
	TextField email,pass;
	Label emailLabel,passLabel;
	label()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("Lable");
	
		FlowLayout layout=new FlowLayout();
		
		setLayout(layout);
		
		b1=new Button("Login");
		email=new TextField(20);
		pass=new TextField(20);
		
		emailLabel=new Label("Enter email");
		passLabel=new Label("Enter password");
		
		add(emailLabel);
		add(email);
		add(passLabel);
		add(pass);
		add(b1);	
	}

	public static void main(String [] args)
	{
		label obj=new label();
	}
}	
	