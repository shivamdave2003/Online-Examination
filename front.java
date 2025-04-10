import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class front extends JPanel
{
	ImageIcon img,img1;
	JLabel l1;
	JButton b1,b2;
	
	front()
	{
		setLayout(null);
		l1=new JLabel("ONLINE EXAMINATION SYSTEM");
		l1.setFont(new Font("Arial", Font.BOLD, 40)); //
        l1.setForeground(Color.WHITE); 
        l1.setBounds(650,250,800,50);
		add(l1);
		
		img=new ImageIcon("help1.png");
		img1=new ImageIcon("rename.png");
		
		b1=new JButton(img);//back
		b1.setBounds(50,900,150,85);
		b1.setContentAreaFilled(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setFocusPainted(false); 
		// No focus rectangle
        b1.setBorderPainted(false);
		// No border
        b1.setOpaque(false);
		 add(b1);
		 
		b2=new JButton(img1);//next
		b2.setBounds(1700,900,150,85);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setContentAreaFilled(false);
		b2.setFocusPainted(false);      // No focus rectangle
        b2.setBorderPainted(false);     // No border
        b2.setOpaque(false);
		 add(b2);
		 
	
 
		
		
	}
	
	public void paintComponent(Graphics g)
	   {
		 super.paintComponent(g);
		img=new ImageIcon("7.jpg");
		g.drawImage(img.getImage(),0,0,1940,1000,null);
		}
}
