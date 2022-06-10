/*
grid layout-->in the form of rows and columns */

import java.awt.*;
import java.awt.event.*;

class grid extends Frame
{
	grid()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("border");
		//GridLayout layout=new GridLayout();
		//GridLayout layout=new GridLayout(2,3);
		GridLayout layout=new GridLayout(3,2,10,15);


		setLayout(layout);
		add(new Button("Hello"));
		add(new Button("hiiii"));
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("2"));
		add(new Button("3"));
	
		
	}
	public static void main(String [] args)
	{
		grid obj=new grid();
	}
} 	