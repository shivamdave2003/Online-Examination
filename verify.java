import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


class verify extends JPanel
{
	JLabel l1,l2;
	JComboBox c1;
	JButton b1,b2,b3,b4;
	
	
	
	verify()
	{
		
		setLayout(null);
		 setBackground(new Color(198,234,196));
	
	Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
	
	l1=new JLabel("VERIFICATION");
	l1.setFont(new Font("Cooper Black", Font.BOLD, 40)); 
     l1.setForeground(Color.WHITE); 
	 l1.setBounds(800,80,500,30);
	 add(l1);
	 
	l2=new JLabel("User for Verification");
	l2.setFont(f); 
     l2.setForeground(Color.RED); 
	 l2.setBounds(470,400,300,80);
	 add(l2);
	 
	 c1=new JComboBox();
	 c1.setBounds(850,400,250,60);
	 add(c1);
	 
	 b1=new JButton("Search");
	 b1.setBounds(1160,400,150,60);
	 b1.setFont(new Font("Arial Black", Font.BOLD, 20));
     b1.setBackground(new Color(0,62,62));
     b1.setForeground(Color.WHITE);
	 add(b1);
	 
	 
	 
	 b3=new JButton("Delete");
	 b3.setBounds(840,500,150,60);
	 b3.setFont(new Font("Arial Black", Font.BOLD, 20));
     b3.setBackground(new Color(0,62,62));
     b3.setForeground(Color.WHITE);
	 add(b3);
	 
	 
	 
	 
	 
	 b4=new JButton("Verify");
	 b4.setBounds(990,500,150,60);
	 b4.setFont(new Font("Arial Black", Font.BOLD, 20));
     b4.setBackground(new Color(0,62,62));
     b4.setForeground(Color.WHITE);
	 add(b4);
	 
	 
	 
	 
	 
	 b2=new JButton("Back");
	 b2.setBounds(20,900,120,60);
	 b2.setFont(new Font("Arial Black", Font.BOLD, 20));
     b2.setBackground(new Color(0,62,62));
     b2.setForeground(Color.WHITE);
	 add(b2);
	 
	 
	 
	 
	 
	 
	
	 
		
	}
	
	void sqluser()
	{
		String a="0";
		c1.removeAllItems();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
			
            ResultSet rs = st.executeQuery("SELECT UNAME FROM regis WHERE VERIFY='"+a+"'");
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

