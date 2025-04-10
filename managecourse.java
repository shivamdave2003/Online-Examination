import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;


public class managecourse extends JPanel 
{
	ImageIcon img;
	JLabel l1,l2;
	public  JComboBox bh110;
	public JComboBox amanji;
	// static final managecourse c;
	JButton b1,b2,b3,b4;
	String[] stringArray;
	String course;
	// public static String isSelected=(String)bh110.getSelectedItem();
	
	
 public managecourse()
	{
		setLayout(null);
	 setBackground(new Color(198,234,196));
	 
	 img=new ImageIcon("project.png");
	 l1=new JLabel(img);
	 l1.setBounds(840,180,230,230);
	 add(l1);
	 
	 l2=new JLabel("MANAGE COURSE");
	 l2.setFont(new Font("Cooper Black", Font.BOLD, 40)); 
     l2.setForeground(Color.WHITE); 
	 l2.setBounds(800,80,500,30);
	 add(l2);

        bh110 = new JComboBox();
        bh110.setBounds(830, 500, 300, 40);
		mysql(bh110);
		add(bh110);

	 b1=new JButton("Add New Course");
		b1.setFont(new Font("Arial Black",Font.BOLD,20));
		b1.setBounds(1180,500,230,45);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBackground(new Color(116,185,188));
		add(b1);
		
	 b2=new JButton("Delete");
		b2.setFont(new Font("Arial Black",Font.BOLD,20));
		b2.setBounds(830,600,140,40);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBackground(new Color(116,185,188));
		add(b2);
		
	 b3=new JButton("Edit Course");
		b3.setFont(new Font("Arial Black",Font.BOLD,20));
		b3.setBounds(990,600,180,40);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBackground(new Color(116,185,188));
		add(b3);
		
	 b4=new JButton("Back");
		b4.setFont(new Font("Arial Black",Font.BOLD,20));
		b4.setBounds(40,900,120,40);
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setBackground(new Color(116,185,188));
		add(b4);
		
	}
	
	void mysql(JComboBox bh110)
	{
		
	 
        ArrayList<String> coursesList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM addcourse");
            while (rs.next())
		{
			bh110.addItem(rs.getString(1));
        }
            con.close();
        } 
		catch (Exception e) 
		{
			
        }
	}
	
	
	
}

