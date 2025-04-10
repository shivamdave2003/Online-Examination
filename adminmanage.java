import javax.swing.*;
import java.awt.*;

class adminmanage extends JPanel
{
	JLabel l1,l2;
	ImageIcon i;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	adminmanage()
	{ 
	
	 setLayout(null);
	 setBackground(new Color(96,79,191));
	Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
	
	
	l1=new JLabel("ADMIN LOGIN");
	l1.setFont(f);
	l1.setBounds(870,3,200,100);
	add(l1);
	
	i=new ImageIcon("adminse.png");
	l2=new JLabel(i);
	l2.setBounds(850,84,270,290);
	add(l2);
	
	t1=new JTextField("Shivam");
	t1.setFont(f);
	t1.setBounds(730,430,450,70);     
    t1.setOpaque(false);
	add(t1);
		
	t2=new JPasswordField("Shivam@123");
	t2.setFont(f);
	t2.setBounds(730,530,450,70);     
    t2.setOpaque(false);
	add(t2);
	 
	 
	b1=new JButton("Login");
	b1.setFont(new Font("Arial Black",Font.BOLD,25));
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b1.setBounds(880,650,130,60);
	b1.setBackground(new Color(116,185,188));
	add(b1);
		
	 
	b2=new JButton("BACK");
	b2.setFont(new Font("Arial Black",Font.BOLD,25));
	b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b2.setBounds(30,900,130,60);
	b2.setBackground(new Color(116,185,188));
	add(b2);
		
		
		
	}
	
}
