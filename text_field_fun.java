/* Text field function
isEditable()--->return boolean if we are able to edit true if not false
setEditable(boolean b)---> we excliptly make it editable or not editable
setText(String s)---> to set text to yhe field
getText()-->if we want to fetch the text then we will use this

*/



import java.awt.*;

class text_field_fun extends Frame
{
	text_field_fun()
	{
		setSize(400,400);
		setVisible(true);
		setTitle("My frame");
		
		FlowLayout layout=new FlowLayout();
		setLayout(layout);
		
		TextField tf=new TextField("My filed 1");
		add(tf);
		System.out.println(tf.isEditable());	
		/*tf.setEditable(false);
		System.out.println(tf.isEditable());	
		*/
		tf.setText("HIIIIIIII");
		System.out.println(tf.getText());
	}
	
	public static void main(String [] args)
	{
		text_field_fun obj=new text_field_fun();
	}	
}	
