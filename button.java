/*Button constructor

1-->Button()
2-->Button(String lable)
*/
import java.awt.*;

class button extends Frame
{	
	button()
	{
		Button b1;
		Button b2;
		Button b3;
		setSize(400,400);
		setVisible(true);
		setTitle("My frame");
		FlowLayout layout=new FlowLayout();
		setLayout(layout);
		b1=new Button("Login");
		b2=new Button("Sign up");
		b3=new Button();
	
		b3.setLabel("Lable set by set lable function ");
		
		System.out.println(b3.getLabel());
		
		b1.setPreferredSize(new Dimension(200,150));
		b1.setBackground(Color.PINK);
		b1.setForeground(Color.BLUE);
		
		b1.setEnabled(false);
		//b1.setVisible(false);
		//b1.show(false);
		
	
		add(b1);
		add(b2);
		add(b3);		
		
		
	}
	
	public static void main(String args [])
	{
		button obj=new button();
	}
}	
