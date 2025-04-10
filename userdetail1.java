import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.toedter.calendar.*;
import java.util.*;
import java.text.*;
import java.sql.*;



class userdetail1 extends JPanel
{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	
	ImageIcon i,i2,i3;
	static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JRadioButton b1,b2;
	ButtonGroup g1;
	JCheckBox c;
	JButton jb1,jb2;
	JDateChooser dc1;
	// PlaceHolder p1;
	
	userdetail1()
	{
		setLayout(null);
		
		
		Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
		
		l1=new JLabel("USER-DETAIL");
		
	    l1.setFont(f);
		l1.setForeground(Color.WHITE); 
		// l1.setBackground(new Color(142,142,142));
	    l1.setBounds(870,0,400,100);
	    add(l1);
		
		
	  
	  
	  
		l3=new JLabel("User-Name");
	    l3.setFont(f);
		l3.setForeground(Color.WHITE); 
	    l3.setBounds(470,150,200,100);
	    add(l3);
	  
	  l4=new JLabel("User-Password");
	  l4.setBounds(1020,150,270,100);
	  l4.setFont(f);
	  l4.setForeground(Color.WHITE);
	  add(l4);
	  
	  l5=new JLabel("Name");
	  l5.setBounds(470,240,220,100);
	  l5.setFont(f);
	  l5.setForeground(Color.WHITE);
	  add(l5);
	  
	  t3=new JTextField();
	  
	  t3.setBounds(659,285,300,30);
	  t3.setFont(f);
	
   
	  add(t3);
	  // p1=new PlaceHolder(t3,"enter name");
	  
	  t1=new JTextField();
	  t1.setBounds(659,185,300,30);
	  t1.setFont(f);
	  add(t1);
	  
	  
	  l6=new JLabel("Contact");
	  l6.setBounds(470,340,220,100);
	  l6.setFont(f);
	  l6.setForeground(Color.WHITE);
	  add(l6);
	  
	  t4=new JTextField();
	  t4.setBounds(659,385,300,30);
	  t4.setFont(f);
	  add(t4);
	  
	  l7=new JLabel("Gender");
	  l7.setBounds(470,440,220,100);
	  l7.setFont(f);
	  l7.setForeground(Color.WHITE);
	  add(l7);
	  
	  t11=new JTextField();
	  t11.setBounds(659,485,300,30);
	  t11.setFont(f);
	  add(t11);
        
	  
	  
	  
	   g1=new ButtonGroup();
	  g1.add(b1);
	  g1.add(b2);
	
	  
	  
	  t2=new JTextField();
	  t2.setBounds(1270,185,300,30);
	  t2.setFont(f);
	  add(t2);
	  
	  l8=new JLabel("Gmail");
	  l8.setBounds(470,540,220,100);
	  l8.setFont(f);
	  l8.setForeground(Color.WHITE);
	  add(l8);
	  
	  
	  t5=new JTextField();
	  t5.setBounds(659,575,300,30);
	  t5.setFont(f);
	  add(t5);
	  
	  
	  l9=new JLabel("Colleg Name");
	  l9.setBounds(1020,540,270,100);
	  l9.setFont(f);
	  l9.setForeground(Color.WHITE);
	  add(l9);
	  
	  t6=new JTextField();
	  t6.setBounds(1270,575,500,30);
	  t6.setFont(f);
	  add(t6);
	  
	  
	  l10=new JLabel("Address");
	  l10.setBounds(470,640,220,100);
	  l10.setFont(f);
	  l10.setForeground(Color.WHITE);
	  add(l10);
	  
	  
	  t7=new JTextField();
	  t7.setBounds(659,675,300,30);
	  t7.setFont(f);
	  add(t7);
	  
	  
	  l11=new JLabel("Birth-Date");
	  l11.setBounds(1020,440,220,100);
	  l11.setFont(f);
	  l11.setForeground(Color.WHITE);
	  add(l11);
	  
	
	 jb1=new JButton("Back");
	 jb1.setBounds(20,900,120,60);
	 jb1.setFont(new Font("Arial Black", Font.BOLD, 20));
     jb1.setBackground(new Color(0,62,62));
     jb1.setForeground(Color.WHITE);
	 add(jb1);
	  
	  t10=new JTextField();
	  t10.setBounds(1270,475,200,60);
	  add(t10);
	  
	
	    setBackground(new Color(170,221,153));
	  
	}
	void sqlshowall1(String name)
	{
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
			
            ResultSet rs = st.executeQuery("SELECT * FROM regis WHERE UNAME='"+name+"'");
        if(rs.next())
	{
    userdetail1.t1.setText(rs.getString(1));		
    userdetail1.t2.setText(rs.getString(2));		
    userdetail1.t3.setText(name);		
    userdetail1.t4.setText(rs.getString(4));		
    userdetail1.t5.setText(rs.getString(7));		
    userdetail1.t6.setText(rs.getString(8));		
    userdetail1.t7.setText(rs.getString(9));		
    userdetail1.t11.setText(rs.getString(5));		
    userdetail1.t10.setText(rs.getString(6));		
	
	}
con.close();
		}
catch(Exception e)
{}	
	}
	
	

}
