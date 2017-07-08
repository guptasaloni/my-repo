import java.awt.*; 
import java.awt.event.*; 
public class CanvasExample  
{  
  public CanvasExample()  
  {  
    Frame f= new Frame("Canvas Example"); 
	
	f.addWindowListener(new WindowAdapter(){		
		
		public void windowClosing(WindowEvent windowevent)
		{
			System.exit(0);
		}
		});
	
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(400, 400);  
    f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new CanvasExample();  
  }  
}  
class MyCanvas extends Canvas  
{  
        public MyCanvas() {  
        setBackground (Color.BLACK);  
        setSize(300, 200);  
     }  
  public void paint(Graphics g)  
  {  
    g.setColor(Color.white);  
    g.fillOval(75, 75, 150, 75);  
  }  
}    