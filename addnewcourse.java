import javax.swing.*;
import java.awt.*;

class addnewcourse extends JPanel
{
	ImageIcon img;
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2;
	
	addnewcourse()
	{
		setLayout(null);
		 setBackground(new Color(198,234,196));
		
		img=new ImageIcon("add-file.png");
		
		l1=new JLabel(img);
		l1.setBounds(830,120,220,230);
		add(l1);
		
	 l2=new JLabel("ADD-COURSE");
	 l2.setFont(new Font("Cooper Black", Font.BOLD, 40)); 
     l2.setForeground(Color.WHITE); 
	 l2.setBounds(780,40,500,30);
	 add(l2);
	 
	 t1=new JTextField("Course Name");
	t1.setFont(new Font("Cooper Black", Font.BOLD, 40));
	t1.setBounds(730,430,450,70);
   t1.setForeground(Color.BLACK); 	
    t1.setOpaque(false);
	add(t1);
	
	    b1=new JButton("Add Course");
		b1.setFont(new Font("Arial Black",Font.BOLD,20));
		b1.setBounds(800,550,230,45);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBackground(new Color(116,185,188));
		add(b1);
	
	    b2=new JButton("Back");
		b2.setFont(new Font("Arial Black",Font.BOLD,20));
		b2.setBounds(40,900,130,45);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBackground(new Color(116,185,188));
		add(b2);
	}
}
