import java.awt.*;
import java.awt.event.*;  
public class ChoiceExample  
{  
        ChoiceExample(){ 
		
		
        Frame f= new Frame(); 
				f.addWindowListener(new WindowAdapter(){		
		
		public void windowClosing(WindowEvent windowevent)
		{
			System.exit(0);
		}
		});
        Choice c=new Choice();  
        c.setBounds(100,100, 75,75);  
        c.add("Item 1");  
        c.add("Item 2");  
        c.add("Item 3");  
        c.add("Item 4");  
        c.add("Item 5");  
        f.add(c);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
   new ChoiceExample();  
}  
}