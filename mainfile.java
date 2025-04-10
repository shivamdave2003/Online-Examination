import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import java.util.ArrayList;
import java.text.*;

//




//

import com.toedter.calendar.*;
class FDemo extends JFrame implements ActionListener,KeyListener
{
	
	Container cn=getContentPane();
	
	front f;
	adminsearch as1;
	adminmanage adm;
	adminpanel  ap;
	managecourse mc1;
	addnewcourse anc;
	createcourse cc;
	useridpass uip;
	newuser nu;
	finaltest ft;
	user user;
	userdetail userdetail;
	userdetail1 userdetail1;
	verify verify;
	 test test;
	 n n;
	
	CardLayout card;
	JLabel l1;
	JLabel background;
	String s1,s2,s4;
	String s19;
	static String s3;
    String course;
	String course1;
	  public String selectcource;
	

	FDemo()
	{ 
	
	card=new CardLayout();
	setLayout(card);
	f=new front();
	as1=new adminsearch();
	adm=new adminmanage();
	ap=new adminpanel();
	mc1=new managecourse();
	anc=new addnewcourse();
	cc=new createcourse();
	uip=new useridpass();
	nu=new newuser();
	ft=new finaltest();
	user=new user();
	userdetail=new userdetail();
	userdetail1=new userdetail1();
	verify=new verify();
	test=new test();
	 n=new n();
	
	add("front",f);
	add("admin",as1);
	add("adminmanage",adm);
	add("adminpanel",ap);
	add("managecourse",mc1);
	add("addnewcourse",anc);
	add("createcourse",cc);
	add("useridpass",uip);
	add("newuser",nu);
	add("finaltest",ft);
	add("user",user);
	add("userdetail",userdetail);
	add("verify",verify);
	add("userdetail1",userdetail1);
	add("test",test);
	test.add(n);
	n.setBounds(100,100,300,400);
	
	f.b2.addActionListener(this);
	as1.b1.addActionListener(this);
	as1.b2.addActionListener(this);
	as1.b3.addActionListener(this);
	adm.b1.addActionListener(this);
	adm.b2.addActionListener(this);
	ap.b1.addActionListener(this);
	ap.b3.addActionListener(this);
	ap.b4.addActionListener(this);
	ap.b5.addActionListener(this);
	ap.b6.addActionListener(this);
	mc1.b1.addActionListener(this);
	mc1.b2.addActionListener(this);
	mc1.b3.addActionListener(this);
	mc1.b4.addActionListener(this);
	mc1.bh110.addActionListener(this);
	anc.b1.addActionListener(this);
	anc.b2.addActionListener(this);
	cc.b12.addActionListener(this);
	cc.b13.addActionListener(this);
	cc.b14.addActionListener(this);
	cc.b15.addActionListener(this);
	// cc.b20.addActionListener(this);
	cc.b3.addActionListener(this);
	cc.b6.addActionListener(this);
	cc.b7.addActionListener(this);
	
	cc.c2.addActionListener(this);
	cc.c2.addKeyListener(this);
	user.b1.addActionListener(this);
	user.b2.addActionListener(this);
	ft.b3.addActionListener(this);
	ft.b4.addActionListener(this);

	
	uip.b4.addActionListener(this);
	uip.b2.addActionListener(this);
	uip.b3.addActionListener(this);
	uip.b1.addActionListener(this);
	nu.jb1.addActionListener(this);
	nu.jb2.addActionListener(this);
	verify.b1.addActionListener(this);
	verify.b2.addActionListener(this);
	verify.b3.addActionListener(this);
	verify.b4.addActionListener(this);
	userdetail.jb1.addActionListener(this);
	userdetail1.jb1.addActionListener(this);
	test.next.addActionListener(this);
	// finaltest.b4.addActionListener(this);
		// test.b1.addActionListener(this);
		
	
	
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==f.b2)
		{ 
		card.next(cn);
	
		}
		
		if(e.getSource()==as1.b1)
		{ 
	card.show(cn,"adminmanage");
		}
				
		if(e.getSource()==adm.b1)
		{ 
	
	 s1=adm.t1.getText();
	 s2=adm.t2.getText();
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from adminlogin where UNAME='"+s1+"' AND UPASS='"+s2+"'");
	if(rs.next())
	{
	card.show(cn,"adminpanel");
	}
	else
	{
		JOptionPane.showMessageDialog(adm.b1,"Invalid Admin User");
	}
	con.close();
	}
catch(Exception e1)
{
	System.out.println(e1);
}	
		
		
		}
		if(e.getSource()==adm.b2)
		{ 
	card.previous(cn);
		}		
		if(e.getSource()==as1.b3)
		{ 
	card.previous(cn);
		}
		if(e.getSource()==ap.b1)
		{ 
	card.show(cn,"managecourse");
		}
		
		if(e.getSource()==mc1.b1)
		{
			card.show(cn,"addnewcourse");
		}
		if(e.getSource()==mc1.b4)
		{
			card.previous(cn);
		}
		if(e.getSource()==anc.b1)
		{
		 s3=anc.t1.getText();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
		Statement st=con.createStatement();
		int x=st.executeUpdate("insert into addcourse values('"+s3+"')");
		if(x!=0)
		{
			mc1.bh110.removeAllItems();
			JOptionPane.showMessageDialog(adm.b1,"COURSE ADDED");
			System.out.println("working");
			mc1.mysql(mc1.bh110);
			card.show(cn,"managecourse");
		}
	con.close();
	}
catch(Exception e2){
	System.out.println(e2);
}
	 try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM addcourse");
            while (rs.next())
			{
                course1 = rs.getString(1);
			}
			mc1.bh110.addItem(course1);
            con.close();
        } 
		catch (Exception e6) 
		{
            
        }
		}
		if(e.getSource()==anc.b2)
		{
			
			card.previous(cn);
			
		// mc1.amanji.removeAllItems();
		// System.out.println("working");
		// mc1.mysql(mc1.amanji);
		
		
			
			
		}
	if(e.getSource()==mc1.b2)
	{
			
		
	 s3=(String)mc1.bh110.getSelectedItem();
	 System.out.println(".........-==-=-=-=---=-=-"+s3);
	 
	
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	
	String query1 = "delete from raman where course ='"+s3+"'";
    

	int x=st.executeUpdate(query1);
	
	if(x!=0)
	{
		JOptionPane.showMessageDialog(adm.b1,"Delete Successfully");
card.show(cn,"managecourse");
	}
	
	con.close();
	}
catch(Exception e2)
{
	System.out.println(e2);
}
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	int x=st.executeUpdate("delete from addcourse where CNAME='"+s3+"'");
	if(x!=0)
	{
		JOptionPane.showMessageDialog(adm.b1,"Delete Successfully");
		 mc1.bh110.removeAllItems();
		System.out.println("working");
		mc1.mysql(mc1.bh110);
		
card.show(cn,"managecourse");
	}
	
	con.close();
	}
catch(Exception e2)
{
	System.out.println(e2);
}	
		
	}
if(e.getSource()==mc1.b3)
{
 	card.show(cn,"createcourse");
	cc.mysqladdqid(cc.c2,(String)mc1.bh110.getSelectedItem(),cc.c3,cc.c21);
	cc.selected.setText((String)mc1.bh110.getSelectedItem());
	
}
if(e.getSource()==ap.b3)
{
	card.show(cn,"front");
}
if(e.getSource()==ap.b4)
{
	card.show(cn,"user");
	user.sqluser();
}
if(e.getSource()==ap.b6)
{
			String userInput = JOptionPane.showInputDialog("Please Enter New Password");
        
		String s7="Shivam";
	
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	

	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	int x=st.executeUpdate(" update adminlogin set UPASS='"+userInput+"' where UNAME='Shivam'");
	if(x!=0)
	{
		JOptionPane.showMessageDialog(adm.b1," Updated Successfully");
card.show(cn,"adminpanel");
	}
	else
	{
		System.out.println("shri ram");
	}
	
	con.close();
	}
catch(Exception e2)
{
	System.out.println(e2);
}	
	
	
}

if(e.getSource()==cc.b3)	
{
	card.show(cn,"managecourse");
	
	System.out.println("ertyuioplokjhgfcx cvbnmkjhgfdxcvbnjkuytgfcvbnjuytgfcvbhnjuytfd");
}
if(e.getSource()==cc.b12)
{
	
	
	
	
	
	String s1=cc.t1.getText();
	String s2=cc.t19.getText();
	String s4=cc.t80.getText();
	String s5=cc.t81.getText();
	String s6=cc.t82.getText();
	String s7=cc.t83.getText();
	String s8=(String)cc.c1.getSelectedItem();
	String s9=cc.t10.getText();
	String s11=(String)mc1.bh110.getSelectedItem();
	selectcource=s11;
	String s12=(String)cc.b4.getSelectedItem();
	
	// System.out.println("TRY K ANDER NHI GAYA");
	String s13="0";
	
	System.out.println("s1= "+s1);
	System.out.println("s2= "+s2);
	System.out.println("s4= "+s4);
	System.out.println("s5= "+s5);
	System.out.println("s6= "+s6);
	System.out.println("s7= "+s7);
	System.out.println("s8= "+s8);
	System.out.println("s9= "+s9);
	System.out.println("s11= "+s11);
	System.out.println("s12= "+s12);
	
	
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	// Connection con=DriverManager.getConnection("mysql:jdbc:///onlineexamination","root","root");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination","root","root");
	Statement st=con.createStatement();
	System.out.println("uper");
	int x=st.executeUpdate("insert into raman values('"+s1+"','"+s2+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s11+"','"+s9+"','"+s12+"')");
	System.out.println("niche");
	
	if(x!=0)
	{
	System.out.println("final");
	JOptionPane.showMessageDialog(null,"Data is Saved");	
	}
	else
	{
		// System.out.println("again try bhai shivam you are doing very hard");
	}
con.close();	
	}
	catch(Exception e6)
	{
	}
	cc.mysqladdqid(cc.c2,(String)mc1.bh110.getSelectedItem(),cc.c3,cc.c21);
}
if(e.getSource()==cc.c2)
{
	
	
		// String s10=(String)mc1.bh110.getSelectedItem();
		/* 
		try
		{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
        Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from raman where course='"+s10+"'");
		while(rs.next())
		{
			cc.c2.removeAllItems();
		System.out.println("working");
		mc1.mysql(mc1.bh110);
			course=rs.getString(1);
			
			  
		}
		int i=Integer.parseInt(course);
		System.out.println(i);
		if(i-1!=i)
		{
	  cc.c2.addItem(course);
	  
		}
		// else
		// {
	  // cc.c2.addItem(course);
		// }
		
		con.close();
		
		}
catch(Exception e1)
{}
 */
			
		
	 //new wali bat
	 // String s2=(String)cc.c2.getSelectedItem();
	 // String s3=(String)mc1.bh110.getSelectedItem();
	 // System.out.println(s2);
	 // System.out.println(s3);
	 
	// starting MySql 
	/* try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from raman where questionid='"+s2+"' and course='"+s3+"'");
	if(rs.next())
	{
	
	cc.t21.setText(rs.getString(2));
	cc.t31.setText(rs.getString(3));
	cc.t41.setText(rs.getString(4));
	cc.t51.setText(rs.getString(5));
	cc.t61.setText(rs.getString(6));
	cc.l12.setText(rs.getString(7));
	
	
	cc.t10.setText(rs.getString(10));
	// System.out.println(rs.getString(10));
	
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Invalid Admin User");
	}
	con.close();
	}
catch(Exception e1)
{
}
	// ending MySql Query
	System.out.println("ram");
*/
} 
if(e.getSource()==as1.b2)
{
	card.show(cn,"useridpass");
}	

if(e.getSource()==uip.b4)
{
card.show(cn,"newuser");
}
if(e.getSource()==nu.jb2)
{
	card.show(cn,"useridpass");
}
if(e.getSource()==uip.b2)
{
	card.show(cn,"admin");
}

if(e.getSource()==nu.jb1)
{
	
	String s1=nu.t1.getText();//user name
	String s2=nu.t2.getText();//user password
	String s3=nu.t3.getText();//enter name
	String s4=nu.t4.getText();// contact
	String s5;
	if(nu.b2.isSelected())
	{
		s5="Male";
		
	}
	else
	{
		s5="Female";
	}
	
	
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
     Date date =nu.dc1.getDate();
    String dateTime = (String) sdf.format(nu.dc1.getDate());
	
	String s6=nu.t5.getText();// gmail
	String s7=nu.t6.getText();// college name
	String s8=nu.t7.getText();// address
	String s9="0";
	
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
		Statement st=con.createStatement();
	System.out.println("sita");
		int x=st.executeUpdate("insert into regis values('"+s1+"','"+s2+"','"+s3+"','" +s4+ "','" +s5+"','" +dateTime+ "','"+s6+"','"+s7+"','"+s8+"','0')");
		if(x!=0)
		{
			JOptionPane.showMessageDialog(null,"Registered");
			card.show(cn,"useridpass");
	System.out.println("geeta");
			
		}
        con.close();
	}
	catch(Exception e11)
	{}
	
}
if(e.getSource()==uip.b1)
{
	
	String s1=uip.t1.getText();
	String s2=uip.t2.getText();
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT VERIFY FROM regis WHERE UNAME='" + s1 + "' AND UPASS='" + s2 + "'");
	
		if(rs.next())
		{

			String a=rs.getString(1);
			int x=Integer.parseInt(a);
			System.out.println(a);
			if(x==0)
			{
			 JOptionPane.showMessageDialog(null, " Dear Subscriber Please Verify Your Self First", "Message",JOptionPane.WARNING_MESSAGE);
			// card.show(cn,"u");	
			}
			if(x==1)
			{
			 JOptionPane.showMessageDialog(null, "SHIVAM DAVE MADE ONLINE TEST SERIES", "WELCOME",JOptionPane.WARNING_MESSAGE);
			 ft.c1.removeAllItems();
			 ft.mysqlcourse();
			card.show(cn,"finaltest");	
			}
		}
		
		
	}
	catch(Exception e12)
	{}
}

if(e.getSource()==uip.b3)
{
	String userInput = JOptionPane.showInputDialog("Please Enter Your Username");
 
 // System.out.println("User input: " + userInput);
 
 
			String userinput = JOptionPane.showInputDialog("Please Enter New Password");
        // System.out.println("User input: " + userinput);
		String s7=uip.t1.getText();
	
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	

	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	int x=st.executeUpdate(" update regis set UPASS='"+userinput+"' where UNAME='"+userInput+"'");
	if(x!=0)
	{
		JOptionPane.showMessageDialog(adm.b1," Updated Successfully");

	}
	else
	{
		// System.out.println("shri ram");
	}
	
	con.close();
	}
	catch(Exception e14)
	{}
 //
}

if(e.getSource()==cc.b13 || e.getSource()==cc.b14 || e.getSource()==cc.b15)
{
	String id;
	String course=(String)mc1.bh110.getSelectedItem();
	if(e.getSource()==cc.b13)
	{

		id=(String)cc.c2.getSelectedItem();
	}
	else if(e.getSource()==cc.b14)
	{
		id=(String)cc.c3.getSelectedItem();
	}		
	else
	{
		id=(String)cc.c21.getSelectedItem();
	}
	
	 try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination", "root", "root");
            Statement st = con.createStatement();
			
            ResultSet rs = st.executeQuery("SELECT * FROM raman WHERE questionid='"+id+"' AND course='"+course+"'");
        if(rs.next())
	{
	
	if(e.getSource()==cc.b13)
	{
	cc.t21.setText(rs.getString(2));
	cc.t31.setText(rs.getString(3));
	cc.t41.setText(rs.getString(4));
	cc.t51.setText(rs.getString(5));
	cc.t61.setText(rs.getString(6));
	cc.l12.setText(rs.getString(7));
	cc.t10.setText(rs.getString(10));
	}
	
	if(e.getSource()==cc.b14)
	{
	cc.t39.setText(rs.getString(2));
	cc.t3.setText(rs.getString(3));
	cc.t4.setText(rs.getString(4));
	cc.t5.setText(rs.getString(5));
	cc.t6.setText(rs.getString(6));
	// cc.l12.setText(rs.getString(7));
	cc.t10.setText(rs.getString(10));
	}
	
	if(e.getSource()==cc.b15)
	{
	cc.t29.setText(rs.getString(2));
	cc.t34.setText(rs.getString(3));
	cc.t45.setText(rs.getString(4));
	cc.t56.setText(rs.getString(5));
	cc.t67.setText(rs.getString(6));
	// cc.l12.setText(rs.getString(7));
	cc.t10.setText(rs.getString(10));
	}
	
	// System.out.println(rs.getString(10));
	}
            con.close();
        } 
		catch (Exception e3) 
		{
			
        }
	
	
	
}
if(e.getSource()==cc.b6)
{
	String selectedcc=(String)mc1.bh110.getSelectedItem();
	String point=(String)cc.c3.getSelectedItem();
	
	String s1=cc.t39.getText();
	String s2=cc.t3.getText();
	String s3=cc.t4.getText();
	String s4=cc.t5.getText();
	String s5=cc.t6.getText();
	String s6=(String)cc.c1.getSelectedItem();
	
	System.out.println("button wapis click");
	
	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination","root","root");
            Statement st = con.createStatement();
			
            int x = st.executeUpdate("UPDATE raman SET question='"+s1+"',option1='"+s2+"',option2='"+s3+"',option3='"+s4+"',option4='"+s5+"',correct='"+s6+"' WHERE course='"+selectedcc+"' AND questionid='"+point+"'");
        if(x!=0)
	{
		JOptionPane.showMessageDialog(null,"Updated");
	
}
    con.close();
        } 
		catch (Exception e9) 
		{
			
        }
	}
	if(e.getSource()==cc.b20)
	{
		System.out.println("radha mohan lal ji bake bihari ji");
	}
	
	
	if(e.getSource()==user.b2)
	{
		card.show(cn,"adminpanel");
		
	}
	if(e.getSource()==user.b1)
	{
		
		userdetail.sqlshowall((String)user.c1.getSelectedItem());
		card.show(cn,"userdetail");
	}
	if(e.getSource()==userdetail.jb1)
	{ System.out.println("ram");
		card.previous(cn);
	}
	if(e.getSource()==ap.b5)
	{
		card.show(cn,"verify");
		verify.sqluser();
	}
	if(e.getSource()==verify.b2)
	{
		card.show(cn,"adminpanel");
	}
	if(e.getSource()==verify.b1)
	{
		
		card.show(cn,"userdetail1");
		userdetail1.sqlshowall1((String)verify.c1.getSelectedItem());
	}
	if(e.getSource()==userdetail1.jb1)
	{
		
		card.show(cn,"verify");
	}
	if(e.getSource()==verify.b4)
	{
		String a=(String)verify.c1.getSelectedItem();
		
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	

	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	int x=st.executeUpdate(" update regis set VERIFY='1' where UNAME='"+a+"'");
	if(x!=0)
	{
		JOptionPane.showMessageDialog(null," VERIFY SUCCESSULLY");
		verify.sqluser();

	}
	else
	{
		System.out.println("shri ram");
	}
	
	con.close();
	}
catch(Exception e21)
{
}
	}
	if(e.getSource()==verify.b3)
	{
		String a=(String)verify.c1.getSelectedItem();
		
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	

	Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
	Statement st=con.createStatement();
	System.out.println(a);
	int x=st.executeUpdate("delete from regis where UNAME='"+a+"'");
	if(x!=0)
	{
		JOptionPane.showMessageDialog(null," DELETE SUCCESSULLY");
		verify.sqluser();

	}
	else
	{
		System.out.println("shri ram");
	}
	
	con.close();
	}
catch(Exception e21)
{
}
		
	}
	
	if(e.getSource()==ft.b3)
	{
		card.show(cn,"admin");
	}
	if(e.getSource()==ft.b4)
	{
		card.show(cn,"test");
		n.cam();
	}
	if(e.getSource()==test.b1)
	{
		 
       
            
	}
	if(e.getSource()==cc.b7)
	{
		 System.out.println("working condition");
       
	String selectedcc=(String)mc1.bh110.getSelectedItem();
	String point=(String)cc.c3.getSelectedItem();
	System.out.println(point);
	
	String s1=cc.t39.getText();
	String s2=cc.t3.getText();
	String s3=cc.t4.getText();
	String s4=cc.t5.getText();
	String s5=cc.t6.getText();
	String s6=(String)cc.c1.getSelectedItem();
	
	System.out.println("button wapis click");
	
	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination","root","root");
            Statement st = con.createStatement();
			
            int x = st.executeUpdate("DELETE FROM raman WHERE course='"+selectedcc+"' AND questionid='"+point+"'");
        if(x!=0)
	{
		JOptionPane.showMessageDialog(null,"Remove Successfully");
	
}
    con.close();
        } 
		catch (Exception e9) 
		{
			
        }
		cc.mysqladdqid(cc.c2,(String)mc1.bh110.getSelectedItem(),cc.c3,cc.c21);
            
	}

	}
	
	
	
public void keyPressed(KeyEvent e) 
{
	 if (e.getKeyCode() == KeyEvent.VK_ENTER)
	 {
		 // System.out.println("radha shyam");
	 }
	 
    
} 
 
public void keyReleased(KeyEvent e2) 
{
		 // System.out.println("shyam sundar");
    
}
 
public void keyTyped(KeyEvent e)
{
		 System.out.println("shyam radhe");
}
}
class mainfile
{
	public static void main(String ar[]) 
	{ 
	FDemo f=new FDemo();
	f.setVisible(true);
	f.setBounds(0,0,2000,2000);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	
	
	}
}

/*
 UPDATE final SET QUESTIONID='', QUESTION='', OPTION1='', OPTION2='', OPTION3='', OPTION4='', CORRECTOPTION='', DURATION='', MARKS='' where COURSENAME='ram'");
	
*/