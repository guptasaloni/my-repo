import java.awt.*;  
import java.awt.event.*;  
public class ListExample  
{  
     ListExample(){  
        Frame f= new Frame();

		f.addWindowListener(new WindowAdapter(){		
		
		public void windowClosing(WindowEvent windowevent)
		{
			System.exit(0);
		}
		});


		
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(500,100);  
        Button b=new Button("Show");  
        b.setBounds(200,150,80,30);  
        final List l1=new List(4, false);  
        l1.setBounds(100,100, 70,70);  
        l1.add("C");  
        l1.add("C++");  
        l1.add("Java");  
        l1.add("PHP");  
        final List l2=new List(4, true);  
        l2.setBounds(100,200, 70,70);  
        l2.add("Turbo C++");  
        l2.add("Spring");  
        l2.add("Hibernate");  
        l2.add("CodeIgniter");  
        f.add(l1); f.add(l2); f.add(label); f.add(b);  
        f.setSize(450,450);  
        f.setLayout(null);  
        f.setVisible(true);  
		
		
        b.addActionListener(new ActionListener() {  
         public void actionPerformed(ActionEvent e) { 
			if(l2.getSelectedItem()==null)
			{
				String data = "Programming language Selected: "+l1.getItem(l1.getSelectedIndex());
				label.setText(data);
			}
			else if(l1.getSelectedItem()==null)
			{
				String frame = ",  Framework Selected: "+l2.getItem(l2.getSelectedIndex());
				label.setText(frame);
			}
          
          
	  
          //data += ", Framework Selected:";  
		//for(String frame:l2.getSelectedItems()){  
		else
		{
			String data = "Programming language Selected: "+l1.getItem(l1.getSelectedIndex());
			String frame = ",  Framework Selected: "+l2.getItem(l2.getSelectedIndex()); 
            data += frame + " "; 
				label.setText(data);
		}
			
            
          //label.setText(data);  
          }  
         });          
}  
public static void main(String args[])  
{  
   new ListExample();  
}  
}  