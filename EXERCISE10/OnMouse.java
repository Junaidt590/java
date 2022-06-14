/**2. Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to
red.*/

import java.awt.*;
import java.awt.event.*;

class House extends Frame
 implements MouseListener{ 
	Color c2=new Color(0,0,255);      
                
public House(){
	addMouseListener(this);
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we) {
        System.exit(0);
        }
       });
      }


public void paint(Graphics g) {

// Draw a polygon
g.setColor(Color.red);
int xpoints[] = {80, 200, 320};
int ypoints[] = {140,75,140};
int num = 3;

g.fillPolygon(xpoints, ypoints, num);

g.setColor(Color.yellow);
g.fillRect(90, 140, 219, 140);

g.setColor(c2);
g.fillRect(180, 220, 40, 60);


}
public void mouseClicked(MouseEvent me){
c2=new Color(255,0,0);
repaint();
}

public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}

public static void main(String[] args) {
House appwin = new House();

appwin.setSize(new Dimension(500, 400));
appwin.setTitle("House");
appwin.setVisible(true);
}
} 
