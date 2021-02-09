package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
class BillPrint extends JFrame{

	private JButton home=new JButton("Home");
	
	JLabel cashMemo=new JLabel("Cash Memo");
	JLabel Vanilla=new JLabel(" Vanilla :");
	JLabel Cone=new JLabel("Cone :");
	JLabel Chocobar=new JLabel("Chocobar :");
	JLabel totalPrice=new JLabel("   Total  Price   :");
	JLabel result=new JLabel("");
	JLabel result1=new JLabel("");
	JLabel result2=new JLabel("");
	JLabel result3=new JLabel("");
	JLabel thanx=new JLabel("Thank you..........");
	public Font f,f1;
	CreateBill crb;
	int p,v,c,k;
	
	public BillPrint(CreateBill crb,int a,int v,int c,int k){
		this.crb=crb;
		this.p=a;
		this.v=v;
		this.c=c;
		this.k=k;
        setTitle("Memo");
        setSize(600,700);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		cashMemo.setBounds(170,40,400,80);
        add(cashMemo);
		f=new Font("Arial",Font.BOLD,18);
		cashMemo.setFont(f);
		Vanilla.setBounds(150,150,150,30);
        add(Vanilla);
        result1.setBounds(250,150,200,30);
		add(result1);
        Cone.setBounds(160,190,150,30);
        add(Cone);
        result2.setBounds(260,190,200,30);
		add(result2);

		Chocobar.setBounds(140,230,150,30);
        add(Chocobar);
        result3.setBounds(240,230,200,30);
		add(result3);


	    totalPrice.setBounds(110,270,150,30);
        add(totalPrice);
        result.setBounds(230,270,200,30);
		add(result);
		thanx.setBounds(170,350,400,80);
        add(thanx);
        home.setBounds(170,450,80,30);
		add(home);
        f1=new Font("Arial",Font.BOLD,18);
		thanx.setFont(f1);

		result.setText(Integer.toString(p));
		result1.setText(Integer.toString(v));
		result2.setText(Integer.toString(c));
		result3.setText(Integer.toString(k)); 


		home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Home h=new Home();
                setVisible(false);
            }
        });
           

          }
	
}
	
        

