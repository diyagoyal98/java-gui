/*Text Field
Constructor 
1->TextField()
2->TextField(String)   //by default text will be set
3->TextField(int c)    //kitne columns ki text filed chaiye 
4->TextField(String t,int c);  
*/


import java.awt.*;
class text_field
{
	public static void main(String [] args)
	{
		Frame f=new Frame();
		f.setSize(600,400);
		f.setVisible(true);
		f.setTitle("My frame");
		
		TextField tf=new TextField("This is text field 1");
		TextField tf1=new TextField("This is text field 2 ");
		TextField tf2=new TextField("This is text field 3 ");
		TextField tf3=new TextField("This is text field 4 ");
		TextField tf4=new TextField("This is text field 5 ");
		TextField tf5=new TextField("This is text field 6 ");


		
		
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(tf4);
		f.add(tf5);
		
		//flow layout
		f.setLayout(new FlowLayout()); //text field is centre align
		//f.setLayout(new FlowLayout());
		
		
		
		
	}
}	

