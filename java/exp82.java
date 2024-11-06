import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class exp82 extends JPanel implements ActionListener{

JRadioButton r1;
JRadioButton r2;
JRadioButton r3;
Color red_c;
Color yellow_c;
Color green_c;
exp82(){

setBounds(0,0,400,400);
r1 = new JRadioButton("Red");
r2 = new JRadioButton("Yellow");
r3 = new JRadioButton("Green");

red_c = getBackground();
yellow_c = getBackground();
green_c = getBackground();
ButtonGroup gp = new ButtonGroup();
gp.add(r1);
gp.add(r2);
gp.add(r3);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);

}

public static void main(String args[])

{

JFrame f = new JFrame("Traffic...");
f.setSize(400, 400);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
exp82 t = new exp82();
f.add(t);

}
public void actionPerformed(ActionEvent ae){
if (r1.isSelected()){

red_c = Color.red;
yellow_c = getBackground();
green_c = getBackground();
repaint();

}
else if (r2.isSelected()){

red_c = getBackground();
yellow_c = Color.yellow;
green_c = getBackground();
repaint();

}

else if (r3.isSelected()){

red_c = getBackground();
yellow_c = getBackground();
green_c = Color.green;
repaint();

}

}
public void paintComponent(Graphics g){
super.paintComponent(g);
g.drawOval(200,100,50,50);
g.drawOval(200,200,50,50);
g.drawOval(200,300,50,50);
g.setColor(red_c);
g.fillOval(200,100,50,50);
g.setColor(yellow_c);
g.fillOval(200,200,50,50);
g.setColor(green_c);
g.fillOval(200,300,50,50);

}

}
