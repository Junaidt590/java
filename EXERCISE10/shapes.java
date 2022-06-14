/**5. Develop a program that has a Choice component which contains
the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s
choice */

import java.awt.*;
import java.awt.event.*;

import java.util.*;

class ShapesChoice extends Frame
implements ItemListener {
Scanner sc=new Scanner(System.in);

Choice shapes;
String msg = "";

public ShapesChoice() {

// Use a flow layout.
setLayout(new FlowLayout());
// Create choice lists.
shapes = new Choice();

// Add items to os list.
shapes.add("select");
shapes.add("triangle");
shapes.add("rectangle");
shapes.add("Square");
shapes.add("circle");



// Add choice lists to window.
add(shapes);

// Add item listeners.
shapes.addItemListener(this);

addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void itemStateChanged(ItemEvent ie) {
repaint();
}

// Display current selections.
public void paint(Graphics g) {
//msg = "Current Shape: ";
msg = shapes.getSelectedItem();
//g.drawString(msg, 100, 120);
//g.drawRect(100,140,100,80);
if(msg.equals("rectangle")){
	g.setColor(Color.magenta);
	//g.drawString("enter your co-ordinates", 200, 120);
	g.fillRect(200,200,200,100);
}
else if(msg.equals("Square")){
	g.setColor(Color.cyan);
	g.fillRect(200,200,200,200);
}
else if(msg.equals("circle")){
	g.setColor(Color.red);
	g.fillOval(200,200,200,200);
}
else if(msg.equals("triangle")){
	g.setColor(Color.blue);
	int xpoints[] = {150, 300, 450};
	int ypoints[] = {400, 150, 400};
	int num = 3;

	g.fillPolygon(xpoints, ypoints, num);
	
}
else{
	g.drawString("Please select your choice", 300, 100);
}


}

public static void main(String[] args) {
ShapesChoice appwin = new ShapesChoice();

appwin.setSize(new Dimension(800, 800));

appwin.setTitle("ChoiceDemo");
appwin.setVisible(true);
}
}

