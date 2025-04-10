import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


class user extends JPanel
{
	JLabel l1,l2;
	JComboBox c1;
	JButton b1,b2;
	
	
	
	user()
	{
		
		setLayout(null);
		 setBackground(new Color(198,234,196));
	
	Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
	
	l1=new JLabel("USER");
	l1.setFont(new Font("Cooper Black", Font.BOLD, 40)); 
     l1.setForeground(Color.WHITE); 
	 l1.setBounds(900,80,500,30);
	 add(l1);
	 
	l2=new JLabel("Availabel User");
	l2.setFont(f); 
     l2.setForeground(Color.RED); 
	 l2.setBounds(160,200,300,80);
	 add(l2);
	 
	 c1=new JComboBox();
	 c1.setBounds(430,204,250,60);
	 add(c1);
	 
	 b1=new JButton("Search");
	 b1.setBounds(800,200,150,60);
	 b1.setFont(new Font("Arial Black", Font.BOLD, 20));
     b1.setBackground(new Color(0,62,62));
     b1.setForeground(Color.WHITE);
	 add(b1);
	 
	 
	 
	 
	 
	 b2=new JButton("Back");
	 b2.setBounds(20,900,120,60);
	 b2.setFont(new Font("Arial Black", Font.BOLD, 20));
     b2.setBackground(new Color(0,62,62));
     b2.setForeground(Color.WHITE);
	 add(b2);
	 
	 
	 
	 
	 
	 
	
	 
		
	}
	
	void sqluser()
	{
		c1.removeAllItems();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
			
            ResultSet rs = st.executeQuery("SELECT NAME FROM regis");
        while(rs.next())
	{
		c1.addItem(rs.getString(1));
	
	}
con.close();
		}
catch(Exception e)
{}		
}
}

