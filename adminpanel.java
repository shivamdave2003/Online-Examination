import javax.swing.*;
import java.awt.*;

class adminpanel extends JPanel
{
	ImageIcon img,img1,img2,img3,img4,img5;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3,b4,b5,b6;
	adminpanel()
	{
		setLayout(null);
	 setBackground(new Color(96,79,191));
	Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
	 
	 l2=new JLabel("ADMIN PANEL");
		l2.setFont(new Font("Arial", Font.BOLD, 40)); //
        l2.setForeground(Color.WHITE); 
        l2.setBounds(850,13,800,50);
		add(l2);
	 
	 img=new ImageIcon("manage.png");
	 l1=new JLabel(img);
	 l1.setBounds(100,200,240,240);
	 add(l1);
	 
	 
		b1=new JButton("Manage Course");
		b1.setFont(new Font("Arial Black",Font.BOLD,20));
		b1.setBounds(380,320,230,60);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBackground(new Color(116,185,188));
		add(b1);
	
	 
	 
	 img1=new ImageIcon("courseresult.png");
	 l3=new JLabel(img1);
	 l3.setBounds(720,190,290,290);
	 add(l3);
	 
	 
		b2=new JButton("Course Result");
		b2.setFont(new Font("Arial Black",Font.BOLD,20));
		b2.setBounds(1050,320,230,60);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBackground(new Color(116,185,188));
		add(b2);
	
	 img2=new ImageIcon("logout.png");
	 l4=new JLabel(img2);
	 l4.setBounds(1350,180,290,290);
	 add(l4);
	 
	 
		b3=new JButton("Logout");
		b3.setFont(new Font("Arial Black",Font.BOLD,20));
		b3.setBounds(1620,320,200,60);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBackground(new Color(116,185,188));
		add(b3);
		
		img3=new ImageIcon("team.png");
	    l5=new JLabel(img3);
		l5.setBounds(100,500,290,290);
		add(l5);
		
		
		b4=new JButton("USER");
		b4.setFont(new Font("Arial Black",Font.BOLD,20));
		b4.setBounds(390,620,200,60);
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setBackground(new Color(116,185,188));
		add(b4);
		
		img4=new ImageIcon("verified.png");
		l6=new JLabel(img4);
		l6.setBounds(720,500,290,290);
		add(l6);
		
		b5=new JButton("Verfication");
		b5.setFont(new Font("Arial Black",Font.BOLD,20));
		b5.setBounds(1050,620,200,60);
		b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b5.setBackground(new Color(116,185,188));
		add(b5);
		
		img5=new ImageIcon("strong-password.png");
		l7=new JLabel(img5);
		l7.setBounds(1350,500,290,290);
		add(l7);
		
		
		b6=new JButton("Change-password");
		b6.setFont(new Font("Arial Black",Font.BOLD,20));
		b6.setBounds(1635,620,260,60);
		b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b6.setBackground(new Color(116,185,188));
		add(b6);
	 
	 
	
	 
}
}
