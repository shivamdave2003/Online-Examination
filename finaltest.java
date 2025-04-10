import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


class finaltest extends JPanel
{ 
JLabel l1,l2,l3,l4,l5;
ImageIcon img,img1,img2;
JButton b1,b2,b3,b4;
JComboBox c1;
	finaltest()
	{
		setLayout(null);
		setBackground(new Color(124,168,233));
		
		
		l1=new JLabel("WELCOME TO SHIV@MS INDUSTRIAL");
	 l1.setFont(new Font("Cooper Black", Font.BOLD, 40)); 
     l1.setForeground(Color.WHITE); 
	 l1.setBounds(500,20,880,30);
	 add(l1);
	 
	 
		img=new ImageIcon("gene.png");
	    l2=new JLabel(img);
		l2.setBounds(100,120,290,290);
		add(l2);
		
		b1=new JButton("EDIT");
		b1.setFont(new Font("Arial Black",Font.BOLD,20));
		b1.setBounds(400,200,180,70);
		b1.setForeground(Color.WHITE);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBackground(new Color(157,157,157));
		add(b1);
		
		
		img1=new ImageIcon("evaluation.png");
	    l3=new JLabel(img1);
		l3.setBounds(720,120,290,290);
		add(l3);
		
		b2=new JButton("RESULT");
		b2.setFont(new Font("Arial Black",Font.BOLD,20));
		b2.setBounds(1070,200,180,70);
		b2.setForeground(Color.WHITE);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBackground(new Color(157,157,157));
		add(b2);
		
		
		img2=new ImageIcon("logout12.png");
	    l4=new JLabel(img2);
		l4.setBounds(1300,120,290,290);
		add(l4);
		
		
		
		b3=new JButton("LOG-OUT");
		b3.setFont(new Font("Arial Black",Font.BOLD,20));
		b3.setBounds(1610,200,180,70);
		b3.setForeground(Color.WHITE);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBackground(new Color(157,157,157));
		add(b3);
		
		c1=new JComboBox();
		c1.setBounds(740,500,300,70);
		add(c1);
		
		l5=new JLabel("Select Course");
		 l5.setFont(new Font("Cooper Black", Font.BOLD, 40)); 
     l5.setForeground(Color.WHITE);
		l5.setBounds(400,500,300,60);
		add(l5);
		
		b4=new JButton("Start");
		b4.setFont(new Font("Arial Black",Font.BOLD,20));
		b4.setBounds(1100,500,160,70);
		b4.setForeground(Color.WHITE);
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setBackground(new Color(157,157,157));
		add(b4);
		
		
	}
	void mysqlcourse()
	{
		
		
	 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM addcourse");
            while (rs.next())
		{
			c1.addItem(rs.getString(1));
        }
            con.close();
        } 
		catch (Exception e) 
		{
			
        }
	}
	}


