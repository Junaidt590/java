/**7. Find the percentage of marks obtained by a student in 5 subjects.
Display a happy face if he secures above 50% or a sad face if
otherwise*/

import java.awt.*;
import java.awt.event.*;

public class happyface extends Frame
implements ActionListener {

TextField t1, t2,t3,t4,t5,t6;
Button b;
Label l1,l2,l3,l4,l5,l6;
public happyface() {
// Use a flow layout.
setLayout(new FlowLayout());

// Create controls.
//Label namep = new Label("Name: ",
//Label.RIGHT);
//Label passp = new Label("Password: ",
//Label.RIGHT);
t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);
t4 = new TextField(10);
t5 = new TextField(10);
t6 = new TextField(10);
l1=new Label("mark1:");
l2=new Label("mark2:");
l3=new Label("mark3:");
l4=new Label("mark4:");
l5=new Label("mark5:");
l6=new Label("result:");

      /*  t1.setBounds(210,500,100,20);
        t2.setBounds(210,80,100,20);
        t3.setBounds(210,120,100,20);
        t4.setBounds(210,160,100,20);
        t5.setBounds(210,200,100,20);
        t6.setBounds(210,240,100,20);
        l1.setBounds(100,40,100,20);
        l2.setBounds(100,80,100,20);
        l3.setBounds(100,120,100,20);
        l4.setBounds(100,160,100,20);
        l5.setBounds(100,200,100,20);
        l6.setBounds(100,240,100,20);*/

        b=new Button("Get result");
        b.setBounds(230,150,60,50);



// Add the controls to the frame.






add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(l6);
add(t6);


add(b);



// Add action event handlers.
//t1.addActionListener(this);
//t2.addActionListener(this);
//t3.addActionListener(this);
//t4.addActionListener(this);
t5.addActionListener(this);

b.addActionListener(this);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

// User pressed Enter.
public void actionPerformed(ActionEvent ae) {
repaint();
}


	public void paint(Graphics g){
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int total=0;
        double per=0;
        g.drawString(" scores out of 100",10,50);


        a= Integer.parseInt(t1.getText());
        b= Integer.parseInt(t2.getText());
        c= Integer.parseInt(t3.getText());
        d= Integer.parseInt(t4.getText());
        e= Integer.parseInt(t5.getText());
        total=a+b+c+d+e;

       t6.setText(String.valueOf(total));
        per=(a+b+c+d+e)/5;
        
        if(per > 50){
            g.setColor(Color.YELLOW);
            g.fillOval(200,100, 150, 150);

            g.setColor(Color.BLACK);
            g.fillOval(240,150,15,15);
            g.fillOval(290,150,15,15);

            g.drawArc(250,180,50,20,180,180);
        }
        else
        {
			g.setColor(Color.YELLOW);
            g.fillOval(200,100, 150, 150);

            g.setColor(Color.BLACK);
            g.fillOval(240,150,15,15);
            g.fillOval(290,150,15,15);

            g.drawArc(250,180,50,20,180,-180);
           
        }
    }




public static void main(String[] args) {
happyface appwin = new happyface();

appwin.setSize(new Dimension(800, 800));
appwin.setTitle("TextFieldDemo");
appwin.setVisible(true);
}
}
