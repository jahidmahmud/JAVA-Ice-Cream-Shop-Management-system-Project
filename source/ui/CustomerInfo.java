package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import services.*;
public class CustomerInfo extends JFrame{
	private JLabel titleLabel=new JLabel("Customer Details");
	private JTable customerDetails;
	private JScrollPane customerDetailsScroll;
	private JButton home=new JButton("Home");

	private CustomerService cs=new CustomerService();
	public CustomerInfo(){
		
		setTitle("Customer Details");
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		titleLabel.setBounds(230,10,400,80);
        add(titleLabel);
        home.setBounds(380,400,80,30);
        add(home);

        String data[][] = cs.customerDetails();
		String title[] = {"ID", "Name", "Phone"};
			
		customerDetails = new JTable(data,title);
		customerDetails.setEnabled(false);
		customerDetailsScroll = new JScrollPane(customerDetails);
		customerDetailsScroll.setBounds(50,100,600,200);
		add(customerDetailsScroll);

		home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Home h=new Home();
                setVisible(false);
            }
        });

	}	
}
