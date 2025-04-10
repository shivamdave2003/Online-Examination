import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;


class createcourse extends JPanel
 {
    JTabbedPane tab1;
	ImageIcon img1,img2,img3,img4,img5;
	JLabel l2,l3,l4,l12;
	//new() wali
	public JComboBox c1,c2,c3,c21,b4;
	JTextField t1,t5,t3,t4,t6,t7,t8,t9,t10,t61,t31,t41,t51,t34,t45,t56,t67,t80,t81,t82,t83;
	JTextArea t2,t39,t29;
	JTextArea t19;
	JLabel selected;
	
	JTextArea t21;
	JButton b3,b12,b13,b14,b15,b6,b20,b7;
	String course;
	String[] s24;
	ArrayList<String> coursesList = new ArrayList<>();
	managecourse mc1=new managecourse();
	

    createcourse() 
	{
        setLayout(null); // Use BorderLayout for the main panel
		 setBackground(new Color(198,234,196));
        tab1 = new JTabbedPane();
		 
		 l3=new JLabel("Course ->");
		 l3.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,50)); //
        l3.setForeground(new Color(136,136,136)); 
        l3.setBounds(750,6,230,50);
		 add(l3);
		 
		 selected=new JLabel();
		 selected.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,50)); //
        selected.setForeground(new Color(136,136,136));
         selected.setBounds(1000,6,230,50);
          add(selected);		 
		 
			// b20=new JButton("   ");
			// b20.setBounds(190,100,75,70);
		    // b20.setOpaque(false);
			// b20.setContentAreaFilled(false);
			// b20.setBorderPainted(false);
			// b20.setFocusPainted(false); 
            // add(b20);
			
		 
		 
		 
		 
		 img1=new ImageIcon("hello.png");
		 l2=new JLabel(img1);
		 l2.setBounds(1500,40,285,290);
		 add(l2);
		 img2=new ImageIcon("visibility.png");
		 img3=new ImageIcon("new.png");
		 img4=new ImageIcon("updated.png");
		 img5=new ImageIcon("trash-bin.png");
		 
		 b3=new JButton("Back");
		 b3.setBounds(120,900,120,40);
		 b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 b3.setBackground(new Color(116,185,188));
		 add(b3);
		 
		 JLabel l8=new JLabel("Duration");
		 l8.setFont(new Font("Cooper Black",Font.BOLD,35)); //
         l8.setForeground(new Color(136,136,136)); 
         l8.setBounds(1550,400,450,40);
		 add(l8);
		 
		 JTextField t9=new JTextField(3);
		 t9.setFont(new Font("Cooper Black",Font.BOLD,35));
		 t9.setBounds(1500,500,60,70);
		 add(t9);
		 
		 JLabel l9=new JLabel(":"); 
		 l9.setFont(new Font("Cooper Black",Font.BOLD,35));
		 l9.setBounds(1580,500,60,70);
		 add(l9);
		 
		 t10=new JTextField(3);
		 t10.setFont(new Font("Cooper Black",Font.BOLD,35));
		 t10.setBounds(1620,500,60,70);
		 add(t10);
		 
		 JLabel l10=new JLabel(":"); 
		 l10.setFont(new Font("Cooper Black",Font.BOLD,35));
		 l10.setBounds(1700,500,60,70);
		 add(l10);
		 
		 JTextField t11=new JTextField(3);
		 t11.setFont(new Font("Cooper Black",Font.BOLD,35));
		 t11.setBounds(1740,500,60,70);
		 add(t11);
		 
		 
		 JLabel l11=new JLabel("Number of Marks");
		 l11.setFont(new Font("Cooper Black",Font.BOLD,20)); //
         l11.setForeground(new Color(136,136,136)); 
		 l11.setBounds(1500,600,230,40);
		 add(l11);
		   
		   String[] a1={"1","2","3","4","5","6","7","8","9"};
		  b4=new JComboBox(a1);
		  b4.setBounds(1730,600,60,40);
		  add(b4);
		  
		  JLabel l12=new JLabel("Total Question :");
		  l12.setFont(new Font("Cooper Black",Font.BOLD,20)); //
          l12.setForeground(new Color(136,136,136)); 
		  l12.setBounds(1530,690,400,30);
		  add(l12);
		  
		  JLabel l13=new JLabel("1");
		  l13.setFont(new Font("Cooper Black",Font.BOLD,20)); //
          l13.setForeground(new Color(136,136,136)); 
		  l13.setBounds(1750,690,400,30);
		  add(l13);
		  
		  
			
		 
		
        tab1.addTab("",img3,new1());//new
        tab1.addTab("",img2,new2());//view
        tab1.addTab("",img4,new3());//update
        tab1.addTab("",img5,new4());//remove
		tab1.setBounds(100,100,1320,780);
		tab1.setBackground(new Color(255,255,255));
        
        add(tab1,null); // Adding tabbed pane to the center of the panel
    }

    JPanel new1()//new 
	{
        JPanel panel = new JPanel();
        panel.setLayout(null); 
		panel.setBackground(new Color(0,115,115));
		
		JLabel l5=new JLabel("Question ID             :");
		l5.setBounds(20,70,600,40);
		l5.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l5.setForeground(Color.WHITE);
		l5.setBackground(Color.WHITE);
		panel.add(l5);
		
		t1=new JTextField(5);
		t1.setBounds(310,75,35,30);
		t1.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		panel.add(t1);
		
		JLabel l6=new JLabel("Question Statement :");
		l6.setBounds(20,150,280,40);
		l6.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l6.setForeground(Color.WHITE);
		l6.setBackground(Color.WHITE);
		panel.add(l6);
		
		
			
			
			
			t19=new JTextArea();
			t19.setBounds(310,150,1000,200);
			t19.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel.add(t19);
			JScrollPane scrollPane = new JScrollPane(t19);
            scrollPane.setBounds(310,150,1000,200);
			
            panel.add(scrollPane);
			
			JLabel l7=new JLabel("OPTION..1         :");
		    l7.setBounds(20,370,300,45);
			l7.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l7.setForeground(Color.WHITE);
		    l7.setBackground(Color.WHITE); 
			panel.add(l7);
			
			t80=new JTextField(10);
		    t80.setBounds(310,370,150,40);
			t80.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel.add(t80);
			
			JLabel l8=new JLabel("OPTION..2         :");
		    l8.setBounds(20,440,300,45);
			l8.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l8.setForeground(Color.WHITE);
		    l8.setBackground(Color.WHITE); 
			panel.add(l8);
			
			t81=new JTextField(10);
		    t81.setBounds(310,440,150,40);
			t81.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel.add(t81);
			
			JLabel l9=new JLabel("OPTION..3         :");
		    l9.setBounds(20,510,300,45);
			l9.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l9.setForeground(Color.WHITE);
		    l9.setBackground(Color.WHITE); 
			panel.add(l9);
			
			t82=new JTextField(10);
		    t82.setBounds(310,510,150,40);
			t82.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel.add(t82);
			
			JLabel l10=new JLabel("OPTION..4         :");
		    l10.setBounds(20,580,300,45);
			l10.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l10.setForeground(Color.WHITE);
		    l10.setBackground(Color.WHITE); 
			panel.add(l10);
			
			t83=new JTextField(10);
		    t83.setBounds(310,580,150,40);
			t83.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel.add(t83);
			
			
			
			
			JLabel l11=new JLabel("CORRECT OPTION ->");
		    l11.setBounds(20,640,500,45);
			l11.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l11.setForeground(Color.WHITE);
		    l11.setBackground(Color.WHITE); 
			panel.add(l11);
			
			String[] ar={"Option_1","Option_2","Option_3","Option_4"};
			c1=new JComboBox(ar);
		    c1.setBounds(510,640,199,40);
			c1.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel.add(c1);
			
			
			
			
			b12=new JButton("Save");
			b12.setBounds(510,480,200,40);
			b12.setFont(new Font("Arial Black", Font.BOLD, 40));
			b12.setBackground(new Color(116,185,188));
            b12.setForeground(Color.WHITE);
			panel.add(b12);
			
		
        add(panel);  
		
		
        return panel;
    }

    JPanel new2()//view
	{
       JPanel panel2 = new JPanel();
        panel2.setLayout(null); // Use FlowLayout for better component arrangement
		panel2.setBackground(new Color(170,170,255));
		
		JLabel l5=new JLabel("Question ID             :");
		l5.setBounds(20,70,600,40);
		l5.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l5.setForeground(Color.WHITE);
		l5.setBackground(Color.WHITE);
		panel2.add(l5);
		
		JLabel l6=new JLabel("Question Statement :");
		l6.setBounds(20,150,280,40);
		l6.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l6.setForeground(Color.WHITE);
		l6.setBackground(Color.WHITE);
		panel2.add(l6);
		
		 t21=new JTextArea();
		t21.setBounds(310,150,1000,200);
		t21.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
		t21.setMargin(new Insets(5, 5, 5, 5));
		panel2.add(t21);
		
		JScrollPane scrollPane = new JScrollPane(t2);
            scrollPane.setBounds(310,150,1000,200);
			// scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            panel2.add(scrollPane);
			
			JLabel l7=new JLabel("OPTION..1         :");
		    l7.setBounds(20,370,300,45);
			l7.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l7.setForeground(Color.WHITE);
		    l7.setBackground(Color.WHITE); 
			panel2.add(l7);
			
			t31=new JTextField(10);
		    t31.setBounds(310,370,150,40);
			t31.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel2.add(t31);
			
			JLabel l8=new JLabel("OPTION..2         :");
		    l8.setBounds(20,440,300,45);
			l8.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l8.setForeground(Color.WHITE);
		    l8.setBackground(Color.WHITE); 
			panel2.add(l8);
			
			t41=new JTextField(10);
		    t41.setBounds(310,440,150,40);
			t41.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel2.add(t41);
			
			JLabel l9=new JLabel("OPTION..3         :");
		    l9.setBounds(20,510,300,45);
			l9.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l9.setForeground(Color.WHITE);
		    l9.setBackground(Color.WHITE); 
			panel2.add(l9);
			
			 t51=new JTextField(10);
		    t51.setBounds(310,510,150,40);
			t51.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel2.add(t51);
		
			JLabel l10=new JLabel("OPTION..4         :");
		    l10.setBounds(20,580,300,45);
			l10.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l10.setForeground(Color.WHITE);
		    l10.setBackground(Color.WHITE); 
			panel2.add(l10);
			
			t61=new JTextField(10);
		    t61.setBounds(310,580,150,40);
			t61.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel2.add(t61);
			
			
			
			
			JLabel l11=new JLabel("CORRECT OPTION ->");
		    l11.setBounds(20,640,500,45);
			l11.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l11.setForeground(Color.WHITE);
		    l11.setBackground(Color.WHITE); 
			panel2.add(l11);
			
			l12=new JLabel("");
		    l12.setBounds(500,640,500,45);
			l12.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l12.setForeground(Color.WHITE);
		    l12.setBackground(Color.WHITE); 
			panel2.add(l12);


			c2=new JComboBox();
		    c2.setBounds(310,75,80,30);
			c2.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
			
			b13=new JButton("Search");
			b13.setBounds(500,63,160,50);
			b13.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
			panel2.add(b13);
			
			
			
			
			panel2.add(c2);
			add(panel2);  
			
        return panel2;
	}
	  void mysqladdqid(JComboBox addq,String s10,JComboBox c3,JComboBox c21)
	{
		
		addq.removeAllItems();
		c3.removeAllItems();
		c21.removeAllItems();
		try
		{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql:///onlineexamination","root","root");
        Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from raman where course='"+s10+"'");
		while(rs.next())
		{
			addq.addItem(rs.getString(1));
			c3.addItem(rs.getString(1));
			c21.addItem(rs.getString(1));
		}
				con.close();
		}
		catch(Exception e)
		{}
		
	}    
	// JCheckBox c3;	
    JPanel new3()
	{
        JPanel panel3 = new JPanel();
		
		panel3.setBackground(new Color(123,255,123));
		panel3.setLayout(null);
		// panel3.setBackground(new Color(0,115,115));
		
		JLabel l5=new JLabel("Question ID             :");
		l5.setBounds(20,70,600,40);
		l5.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l5.setForeground(Color.WHITE);
		l5.setBackground(Color.WHITE);
		panel3.add(l5);
		
			  c3=new JComboBox();
		    c3.setBounds(310,75,80,30);
			c3.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
			panel3.add(c3);
			
			
			b14=new JButton("Search");
			b14.setBounds(500,63,160,50);
			b14.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
			panel3.add(b14);
			
		JLabel l6=new JLabel("Question Statement :");
		l6.setBounds(20,150,280,40);
		l6.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l6.setForeground(Color.WHITE);
		l6.setBackground(Color.WHITE);
		panel3.add(l6);
		
		t39=new JTextArea();
		t39.setBounds(310,150,1000,200);
		t39.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
		t39.setMargin(new Insets(5, 5, 5, 5));
		panel3.add(t39);
		
		JScrollPane scrollPane = new JScrollPane(t2);
            scrollPane.setBounds(310,150,1000,200);
			// scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            panel3.add(scrollPane);
			
			JLabel l7=new JLabel("OPTION..1         :");
		    l7.setBounds(20,370,300,45);
			l7.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l7.setForeground(Color.WHITE);
		    l7.setBackground(Color.WHITE); 
			panel3.add(l7);
			
			t3=new JTextField(10);
		    t3.setBounds(310,370,150,40);
			t3.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel3.add(t3);
			
			JLabel l8=new JLabel("OPTION..2         :");
		    l8.setBounds(20,440,300,45);
			l8.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l8.setForeground(Color.WHITE);
		    l8.setBackground(Color.WHITE); 
			panel3.add(l8);
			
			t4=new JTextField(10);
		    t4.setBounds(310,440,150,40);
			t4.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel3.add(t4);
			
			JLabel l9=new JLabel("OPTION..3         :");
		    l9.setBounds(20,510,300,45);
			l9.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l9.setForeground(Color.WHITE);
		    l9.setBackground(Color.WHITE); 
			panel3.add(l9);
			
			 t5=new JTextField(10);
		    t5.setBounds(310,510,150,40);
			t5.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel3.add(t5);
			
			JLabel l10=new JLabel("OPTION..4         :");
		    l10.setBounds(20,580,300,45);
			l10.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l10.setForeground(Color.WHITE);
		    l10.setBackground(Color.WHITE); 
			panel3.add(l10);
			
			 t6=new JTextField(10);
		    t6.setBounds(310,580,150,40);
			t6.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel3.add(t6);
			
			
			
			
			JLabel l11=new JLabel("CORRECT OPTION ->");
		    l11.setBounds(20,640,500,45);
			l11.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l11.setForeground(Color.WHITE);
		    l11.setBackground(Color.WHITE); 
			panel3.add(l11);
			
			String[] ar={"Option_1","Option_2","Option_3","Option_4"};
			 c1=new JComboBox(ar);
		    c1.setBounds(510,640,199,40);
			c1.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel3.add(c1);
			
			
			
			
			b6=new JButton("Update");
			b6.setBounds(510,480,280,50);
			b6.setFont(new Font("Arial Black", Font.BOLD, 40));
			b6.setBackground(new Color(116,185,188));
            b6.setForeground(Color.WHITE);
			panel3.add(b6);
			
			
		
        add(panel3);  
		
		
       
       
	   
        return panel3;
    }

    JPanel new4()
	{
        JPanel panel4 = new JPanel();
        panel4.setLayout(null); // Use FlowLayout for better component arrangement
		panel4.setBackground(new Color(255,255,65));
		
		JLabel l5=new JLabel("Question ID             :");
		l5.setBounds(20,70,600,40);
		l5.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l5.setForeground(Color.WHITE);
		l5.setBackground(Color.WHITE);
		panel4.add(l5);
		
			
			 c21=new JComboBox();
		    c21.setBounds(310,75,80,30);
			c21.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
			panel4.add(c21);
			
			
			b15=new JButton("Search");
			b15.setBounds(500,63,160,50);
			b15.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
			panel4.add(b15);
		
		JLabel l6=new JLabel("Question Statement :");
		l6.setBounds(20,150,280,40);
		l6.setFont(new Font("Arial Black", Font.BOLD, 20)); 
        l6.setForeground(Color.WHITE);
		l6.setBackground(Color.WHITE);
		panel4.add(l6);
		
		 t29=new JTextArea();
		t29.setBounds(310,150,1000,200);
		t29.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
		t29.setMargin(new Insets(5, 5, 5, 5));
		panel4.add(t29);
		
		JScrollPane scrollPane = new JScrollPane(t2);
            scrollPane.setBounds(310,150,1000,200);
			// scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            panel4.add(scrollPane);
			
			JLabel l7=new JLabel("OPTION..1         :");
		    l7.setBounds(20,370,300,45);
			l7.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l7.setForeground(Color.WHITE);
		    l7.setBackground(Color.WHITE); 
			panel4.add(l7);
			
			 t34=new JTextField(10);
		    t34.setBounds(310,370,150,40);
			t34.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel4.add(t34);
			
			JLabel l8=new JLabel("OPTION..2         :");
		    l8.setBounds(20,440,300,45);
			l8.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l8.setForeground(Color.WHITE);
		    l8.setBackground(Color.WHITE); 
			panel4.add(l8);
			
			 t45=new JTextField(10);
		    t45.setBounds(310,440,150,40);
			t45.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel4.add(t45);
			
			JLabel l9=new JLabel("OPTION..3         :");
		    l9.setBounds(20,510,300,45);
			l9.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l9.setForeground(Color.WHITE);
		    l9.setBackground(Color.WHITE); 
			panel4.add(l9);
			
			 t56=new JTextField(10);
		    t56.setBounds(310,510,150,40);
			t56.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel4.add(t56);
			
			JLabel l10=new JLabel("OPTION..4         :");
		    l10.setBounds(20,580,300,45);
			l10.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l10.setForeground(Color.WHITE);
		    l10.setBackground(Color.WHITE); 
			panel4.add(l10);
			
			 t67=new JTextField(10);
		    t67.setBounds(310,580,150,40);
			t67.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel4.add(t67);
			
			
			
			
			JLabel l11=new JLabel("CORRECT OPTION ->");
		    l11.setBounds(20,640,500,45);
			l11.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25)); 
            l11.setForeground(Color.WHITE);
		    l11.setBackground(Color.WHITE); 
			panel4.add(l11);
			
			String[] ar={"Option_1","Option_2","Option_3","Option_4"};
			JComboBox c1=new JComboBox(ar);
		    c1.setBounds(510,640,199,40);
			c1.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
			panel4.add(c1);
			
			
			
			
		    b7=new JButton("Remove");
			b7.setBounds(510,480,280,50);
			b7.setFont(new Font("Arial Black", Font.BOLD, 40));
			b7.setBackground(new Color(116,185,188));
            b7.setForeground(Color.WHITE);
			panel4.add(b7);
			
			
		
        add(panel4);  
		
		
       
       
	   
        return panel4;
       
       
    }
 
 }