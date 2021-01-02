import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=Div width=500 height=500>
</applet>*/
public class Div extends Applet implements ActionListener
{
	Button b1,b2;
	Label l1,l2,l3;
    	TextField tf1,tf2,tf3;
	String msg;
	public void init()
	{        
        		b1=new Button("COMPUTE");
        		b1.addActionListener(this);
        		b2=new Button("CLEAR");
        		b2.addActionListener(this);
        		tf1=new TextField(20);
        		tf2=new TextField(20);
		tf3=new TextField(20);
        		l1=new Label("NUMBER1");
		l2=new Label("NUMBER2");
        		l3=new Label("RESULT");
		add(l1); 
		add(tf1);
       		add(l2); 
		add(tf2);
		add(l3); 
		add(tf3);
		add(b1); 
		add(b2);
}
public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==b1)
      {
  try{   			
int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
int c=a/b;
tf3.setText(""+c);
}
catch(NumberFormatException ex)
{
tf3.setText(" ");
JFrame f=new JFrame();  
JOptionPane.showMessageDialog(f,"Enter only numbers");
repaint();
}
catch(ArithmeticException ex)
{
tf3.setText(" ");
JFrame f=new JFrame();  
JOptionPane.showMessageDialog(f,"Enter second value non zero");
repaint();
}
}
else
{
tf1.setText("");
tf2.setText("");
tf3.setText("");
msg="";
repaint();
}
}
public void paint(Graphics g)
{
g.drawString(msg,30,70);
}
}
