import java.awt.*;

class text_field_2
{
	public static void main(String [] args)
	{
		myframe obj=new myframe();
	}
}

class myframe extends Frame
{
	private TextField t1=new TextField("Field 1");
	private TextField t2=new TextField("Field 2");
	private TextField t3=new TextField("Field 3");
	
	
	myframe()
	{
		setSize(900,400);
		setVisible(true);
		setTitle("My frame");
		
		//FlowLayout layout= new FlowLayout(FlowLayout.LEFT);
		FlowLayout layout= new FlowLayout(FlowLayout.LEFT,20,20);//vertical , horizontal gap between fiels
		
		
		setLayout(layout);
		
		add(t1);
		add(t2);
		add(t3);
	}
}	
		
		