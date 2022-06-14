/**1. Program to draw Circle, Rectangle, Line
*/

import java.awt.*;
import java.awt.event.*;

class ColorDemo extends Frame{
        
                
public ColorDemo(){
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we) {
        System.exit(0);
        }
       });
      }


public void paint(Graphics g) {

g.setColor(Color.blue);
g.fillRect(20, 40, 80, 80);

g.setColor(Color.red);
g.fillOval(20, 150, 80, 80);

g.setColor(Color.black);
g.drawLine(20,260, 120, 260);
}
public static void main(String[] args) {
ColorDemo appwin = new ColorDemo();

appwin.setSize(new Dimension(500, 400));
appwin.setTitle("ColorDemo");
appwin.setVisible(true);
}
}            
                
	
