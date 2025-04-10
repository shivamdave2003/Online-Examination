import java.awt.*;
import javax.swing.*;

class useridpass extends JPanel
{
	JLabel l1,l2,l3;
	ImageIcon i,i1;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3,b4;
	
	useridpass()
	{
		setLayout(null);
	 setBackground(new Color(170,221,153));
	Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
	
	
	l1=new JLabel("USER LOGIN");
	l1.setFont(f);
	l1.setBounds(870,3,200,100);
	add(l1);
	
	i=new ImageIcon("login.png");
	l2=new JLabel(i);
	l2.setBounds(800,104,270,290);
	add(l2);
	
	t1=new JTextField("pretam");
	t1.setFont(f);
	t1.setBounds(730,430,450,70);     
    t1.setOpaque(false);
	add(t1);
		
	t2=new JPasswordField("Pretam@123");
	t2.setFont(f);
	t2.setBounds(730,530,450,70);     
    t2.setOpaque(false);
	add(t2);
	 
	 
	b1=new JButton("Login");
	b1.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,25));
	b1.setBounds(730,650,130,60);
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b1.setBackground(new Color(189,252,255));
	add(b1);
		
	 
	b2=new JButton("BACK");
	b2.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,25));
	b2.setBounds(30,900,130,60);
	b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b2.setBackground(new Color(189,252,255));
	add(b2);
	
	
	b3=new JButton("Forget Password");
	b3.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,25));
	b3.setBounds(910,650,270,60);
	b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b3.setBackground(new Color(189,252,255));
	add(b3);
		
		i1=new ImageIcon("newuser.png");
		l3=new JLabel(i1);
		l3.setBounds(1500,104,290,290);
		add(l3);
		
		
	b4=new JButton("New-User");
	b4.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,25));
	b4.setBounds(1540,480,200,60);
	b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b4.setBackground(new Color(189,252,255));
	add(b4);
		
		
	}
}
