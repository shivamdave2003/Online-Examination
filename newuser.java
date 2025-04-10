import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.toedter.calendar.*;
import java.util.*;
import java.text.*;



class newuser extends JPanel
{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JPasswordField t2;
	ImageIcon i,i2,i3;
	JTextField t1,t3,t4,t5,t6,t7,t8,t9;
	JRadioButton b1,b2;
	ButtonGroup g1;
	JCheckBox c;
	JButton jb1,jb2;
	JDateChooser dc1;
	// PlaceHolder p1;
	
	newuser()
	{
		setLayout(null);
		
		
		Font f=new Font("Berlin Sans FB Demi",Font.BOLD,30);
		
		l1=new JLabel("Registration_Form");
		
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
	  
	  t3=new JTextField("enter name ");
	  
	  t3.setBounds(659,285,300,30);
	  t3.setFont(f);
	
   
	  add(t3);
	  // p1=new PlaceHolder(t3,"enter name");
	  
	  t1=new JTextField("USER-NAME");
	  t1.setBounds(659,185,300,30);
	  t1.setFont(f);
	  add(t1);
	  
	  
	  l6=new JLabel("Contact");
	  l6.setBounds(470,340,220,100);
	  l6.setFont(f);
	  l6.setForeground(Color.WHITE);
	  add(l6);
	  
	  t4=new JTextField("91->");
	  t4.setBounds(659,385,300,30);
	  t4.setFont(f);
	  add(t4);
	  
	  l7=new JLabel("Gender");
	  l7.setBounds(470,440,220,100);
	  l7.setFont(f);
	  l7.setForeground(Color.WHITE);
	  add(l7);
	  
	  b1=new JRadioButton();
	   b1.setText("FeMale");
	  b1.setBounds(759,475,300,30);
	  b1.setForeground(Color.WHITE);
	  b1.setFont(f);
        b1.setOpaque(false);
	  add(b1);
	
	  b2=new JRadioButton();
	   b2.setText("Male");
	   b2.setFont(f);
	    b2.setForeground(Color.WHITE);
        b2.setOpaque(false);
	  b2.setBounds(659,475,300,30);
	  add(b2);
	  
	  
	  
	   g1=new ButtonGroup();
	  g1.add(b1);
	  g1.add(b2);
	
	  
	  
	  t2=new JPasswordField("!!");
	  t2.setBounds(1270,185,300,30);
	  t2.setFont(f);
	  add(t2);
	  
	  l8=new JLabel("Gmail");
	  l8.setBounds(470,540,220,100);
	  l8.setFont(f);
	  l8.setForeground(Color.WHITE);
	  add(l8);
	  
	  
	  t5=new JTextField("@file");
	  t5.setBounds(659,575,300,30);
	  t5.setFont(f);
	  add(t5);
	  
	  
	  l9=new JLabel("Colleg Name");
	  l9.setBounds(1020,540,270,100);
	  l9.setFont(f);
	  l9.setForeground(Color.WHITE);
	  add(l9);
	  
	  t6=new JTextField("College-Name Please");
	  t6.setBounds(1270,575,500,30);
	  t6.setFont(f);
	  add(t6);
	  
	  
	  l10=new JLabel("Address");
	  l10.setBounds(470,640,220,100);
	  l10.setFont(f);
	  l10.setForeground(Color.WHITE);
	  add(l10);
	  
	  
	  t7=new JTextField("Address-Please");
	  t7.setBounds(659,675,300,30);
	  t7.setFont(f);
	  add(t7);
	  
	  i2=new ImageIcon("submit.png");
	  jb1=new JButton(i2);
	  jb1.setBounds(710,785,156,89);
	  jb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  add(jb1);
	  
	  
	  l11=new JLabel("Birth-Date");
	  l11.setBounds(1020,440,220,100);
	  l11.setFont(f);
	  l11.setForeground(Color.WHITE);
	  add(l11);
	  
	  i3=new ImageIcon("bracket.png");
	  jb2=new JButton(i3);
	  jb2.setBounds(50,900,103,60);
	  jb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	  add(jb2);
	  
	  dc1=new JDateChooser();
	  dc1.setBounds(1270,475,200,60);
	  add(dc1);
	  
	
	    setBackground(new Color(170,221,153));
	  
	}
	public void JTextFieldFocusLost(java.awt.event.FocusEvent evt)
	{
		if(t1.getText().equals(""));
		{
			// t1.setTextFiled("radha mohan");
	}
	
}
}
