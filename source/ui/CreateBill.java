package ui;
import javax.swing.*;
import java.awt.event.*;
import  repositories.*;
class CreateBill extends JFrame implements ActionListener{
	public int sum=0,a=0;
	
	CreateBill c;
	
	//JLabel jl1=new JLabel("Customer Name");
	//JLabel jl2=new JLabel("Customer Phone");
	JLabel jl3=new JLabel("Vanilla");
	JLabel jl4=new JLabel("Cone");
	JLabel jl5=new JLabel("Chocobar");
	JLabel jl6=new JLabel("");
	JButton create=new JButton("Create");
	JButton reset=new JButton("Reset");
	JButton cancell=new JButton("Cancell");
	JButton bill=new JButton("Bill");
	JTextField customerName=new JTextField();
	JTextField customerPhone=new JTextField();
	JTextField vanilla=new JTextField();
	JTextField cone=new JTextField();
	JTextField chocobar=new JTextField();

	CreateBill createBill;
	Home home;
	ProductRepositories pr= new ProductRepositories();
	
	public CreateBill(Home home){
		this.home=home;
		createBill=this;
		 //home.setVisible(true);

        setTitle("CreateBill");
        setSize(800,600);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*jl1.setBounds         (200,180,100,30);
		add(jl1);
		customerName.setBounds(300,180,100,30);
		add(customerName);
		
		jl2.setBounds         (200,230,100,30);
		add(jl2);
		customerPhone.setBounds(300,230,100,30);
		add(customerPhone);
		*/
	    jl3.setBounds         (200,190,100,30);
        add(jl3);
        vanilla.setBounds     (300,190,100,30);
        add(vanilla);
		
		jl4.setBounds         (200,240,100,30);
        add(jl4);
        cone.setBounds        (300,240,100,30);
		add(cone);
        
	    jl5.setBounds         (200,290,100,30);
		add(jl5);
     	chocobar.setBounds    (300,290,100,30);
	    add(chocobar);
		
		bill.setBounds        (200,340,100,30);
		add(bill);
		bill.addActionListener(this);
		
		jl6.setBounds        (310,340,100,30);
		add(jl6);
		
		create.setBounds      (290,390,80,30);
		add(create);
		create.addActionListener(this);

		reset.setBounds       (190,390,80,30);
		add(reset);
		reset.addActionListener(this);
		
		
		cancell.setBounds     (380,390,80,30);
		add(cancell);
		cancell.addActionListener(this);



		
		
	}
	public void actionPerformed(ActionEvent e){
		
			if(e.getSource()==reset)
		{
			customerName.setText("");
			customerPhone.setText("");
			vanilla.setText("");
			cone.setText("");
			chocobar.setText("");
			jl6.setText("");
		}
		else if(e.getSource()==bill)
		{

			if(chocobar.getText().equals("") && vanilla.getText().equals("") && cone.getText().equals("")){
				jl6.setText(Integer.toString(0));
			}
				


				else if(chocobar.getText().equals("") && vanilla.getText().equals(""))
			{
				
				String l2=cone.getText();
				int num2= Integer.parseInt(l2);
				int v=num2*100;
				String j1= Integer.toString(v);
				jl6.setText(j1);
			}
			else if(cone.getText().equals("") && vanilla.getText().equals(""))
			{
				
				String l2=chocobar.getText();
				int num2= Integer.parseInt(l2);
				int v=num2*100;
				String j1= Integer.toString(v);
				jl6.setText(j1);
			}
			else if(cone.getText().equals("") && chocobar.getText().equals(""))
			{
				String l2=vanilla.getText();
				int num2= Integer.parseInt(l2);
				int v=num2*90;
				String j1= Integer.toString(v);
				jl6.setText(j1);
			}
			else if(vanilla.getText().equals(""))
			{
				String l1=cone.getText();
				int num1= Integer.parseInt(l1);
				String l2=chocobar.getText();
				int num2= Integer.parseInt(l2);
				int v=((num1*100)+(num2*100));
				String j1= Integer.toString(v);
				jl6.setText(j1);			
			}
			else if(cone.getText().equals(""))
			{
				String l1=vanilla.getText();
				int num1= Integer.parseInt(l1);
				String l2=chocobar.getText();
				int num2= Integer.parseInt(l2);
				int v=((num1*90)+(num2*100));
				String j1= Integer.toString(v);
				jl6.setText(j1);
			}
			else if(chocobar.getText().equals(""))
			{
				String l1=vanilla.getText();
				int num1= Integer.parseInt(l1);
				String l2=cone.getText();
				int num2= Integer.parseInt(l2);
				int v=((num1*90)+(num2*100));
				String j1= Integer.toString(v);
				jl6.setText(j1);
			}
		
			else
			{
			String l1=vanilla.getText();
			int num1= Integer.parseInt(l1);
			String l2=cone.getText();
			int num2= Integer.parseInt(l2);
			String l3=chocobar.getText();
			int num3= Integer.parseInt(l3);
			int v=((num1*90)+(num2*100)+(num3*100));
			String j1= Integer.toString(v);
			jl6.setText(j1);
			}
		}
		else if(e.getSource()==cancell)
		{
			Home h=new Home();
			setVisible(false);
			
		}
		else if(e.getSource()==create){
            	if(chocobar.getText().equals("") && vanilla.getText().equals("") && cone.getText().equals("")){
				a=0;
				BillPrint b=new BillPrint(createBill,a,0,0,0);
           		createBill.setVisible(false);
			}
				


				else if(chocobar.getText().equals("") && vanilla.getText().equals(""))
			{
				
				String l2=cone.getText();
				int num2= Integer.parseInt(l2);
				a=num2*100;
				BillPrint b=new BillPrint(createBill,a,0,num2,0);
           		createBill.setVisible(false);
           		pr.updateProduct(0,num2,0);
			}
			else if(cone.getText().equals("") && vanilla.getText().equals(""))
			{
				
				String l2=chocobar.getText();
				int num2= Integer.parseInt(l2);
				a=num2*100;
				BillPrint b=new BillPrint(createBill,a,0,0,num2);
           		createBill.setVisible(false);

				pr.updateProduct(0,0,num2);

			}
			else if(cone.getText().equals("") && chocobar.getText().equals(""))
			{
				String l2=vanilla.getText();
				int num2= Integer.parseInt(l2);
				a=num2*90;
				BillPrint b=new BillPrint(createBill,a,num2,0,0);
           		createBill.setVisible(false);
           		pr.updateProduct(num2,0,0);


			}
			else if(vanilla.getText().equals(""))
			{
				String l1=cone.getText();
				int num1= Integer.parseInt(l1);
				String l2=chocobar.getText();
				int num2= Integer.parseInt(l2);
				a=((num1*100)+(num2*100));
				BillPrint b=new BillPrint(createBill,a,0,num1,num2);
           		createBill.setVisible(false);
           		pr.updateProduct(0,num1,num2);
			}
			else if(cone.getText().equals(""))
			{
				String l1=vanilla.getText();
				int num1= Integer.parseInt(l1);
				String l2=chocobar.getText();
				int num2= Integer.parseInt(l2);
				a=((num1*90)+(num2*100));
				BillPrint b=new BillPrint(createBill,a,num1,0,num2);
           		createBill.setVisible(false);
           		pr.updateProduct(num1,0,num2);	

			}
			else if(chocobar.getText().equals(""))
			{
				String l1=vanilla.getText();
				int num1= Integer.parseInt(l1);
				String l2=cone.getText();
				int num2= Integer.parseInt(l2);
				a=((num1*90)+(num2*100));
				BillPrint b=new BillPrint(createBill,a,num1,num2,0);
           		createBill.setVisible(false);
           		pr.updateProduct(num1,num2,0);
			}
		
			else
			{
			String l1=vanilla.getText();
			int num1= Integer.parseInt(l1);
			String l2=cone.getText();
			int num2= Integer.parseInt(l2);
			String l3=chocobar.getText();
			int num3= Integer.parseInt(l3);
			a=((num1*90)+(num2*100)+(num3*100));
			BillPrint b=new BillPrint(createBill,a,num1,num2,num3);
           	createBill.setVisible(false);
           	pr.updateProduct(num1,num2,num3);
			}

			//BillPrint b=new BillPrint(createBill,a);
           //createBill.setVisible(false);
		}


		
	}


}
