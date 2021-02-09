package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import services.*;
public class Home extends JFrame{
	
	JLabel ShopName=new JLabel("Icecream Shop Management System");
	JButton productInfo=new JButton("Product Info");
	JButton addCustomer=new JButton("Add Customer");
	JButton createBill=new JButton("Create Bill");
	JButton customerInfo=new JButton("Customer Info");
	//JButton employees=new JButton("Employees");



	//JButton jb3=new JButton("Regular Customer");
	JButton employees=new JButton("Employees");
	JButton logOut=new JButton("LogOut");
	//JTextField Search=new JTextField();
	//JLabel search=new JLabel("Search");
	//JButton j6=new JButton("==>");
	Home home;
	//Home createBillHome;
	
	
	public Font f,f1;
	public Home(){
		home=this;
		setTitle("HOME");
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		ShopName.setBounds(230,10,400,80);
        add(ShopName);
		f=new Font("Arial",Font.BOLD,18);
		ShopName.setFont(f);
		
		productInfo.setBounds(60,100,120,30);
        add(productInfo);
		addCustomer.setBounds(60,140,120,30);
        add(addCustomer);
		createBill.setBounds(60,180,120,30);
        add(createBill);        
		customerInfo.setBounds(60,220,120,30);
        add(customerInfo);
		employees.setBounds(60,260,120,30);
        add(employees);
        logOut.setBounds(60,300,120,30);
        add(logOut);
		
		productInfo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           ProductRecord p=new ProductRecord(home);
           home.setVisible(false);

            }});

		createBill.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           CreateBill cb1=new CreateBill(home);
           home.setVisible(false);

            }}); 

		employees.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           Employees em=new Employees(home);
           home.setVisible(false);

            }});


		logOut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           LogIn l=new LogIn();
           home.setVisible(false);
           

            }});

			addCustomer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            AddCustomer a=new AddCustomer(home);
           
           home.setVisible(false);

            }});

            customerInfo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           CustomerInfo em=new CustomerInfo();
           home.setVisible(false);

            }});








	
	}
	
}