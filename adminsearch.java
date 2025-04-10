import javax.swing.*;
import java.awt.*;


class adminsearch extends JPanel
{
	ImageIcon img;
	JLabel l1;
	JButton b1,b2,b3;
	
	adminsearch()
	{
		setLayout(null);
		setBackground(new Color(96,79,191));
		img=new ImageIcon("admin.png");
		l1=new JLabel(img);
		l1.setBounds(700,20,430,420);
		add(l1);
		
		b1=new JButton("ADMIN");
		b1.setFont(new Font("Arial Black", Font.BOLD, 40));
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBounds(700,500,400,60);
		b1.setBackground(new Color(116,185,188));
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.setForeground(Color.blue);
		add(b1);
		
		
		b2=new JButton("USER");
		b2.setFont(new Font("Arial Black", Font.BOLD, 40));
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(700,600,400,60);
		b2.setBackground(new Color(116,185,188));
        b2.setForeground(Color.blue);
		add(b2);
		
		// img1=new ImageIcon();
		
		b3=new JButton("BACK");
	
		b3.setFont(new Font("Arial Black",Font.BOLD,25));
		b3.setBounds(90,870,130,60);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBackground(new Color(116,185,188));
		add(b3);
		
	}
}
