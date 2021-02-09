package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;
import java.awt.Font;
public class AddCustomer extends JFrame{

    JButton jb=new JButton("Add");
    JButton home=new JButton("Home");


    JTextField customerId=new JTextField();
	JTextField customerName=new JTextField();
	JTextField customerPhone=new JTextField();
	JLabel jl=new JLabel("Please Fill Up The Following Requirements");
    JLabel jl1=new JLabel("Customer Id");
    JLabel jl2=new JLabel("Customer Name");
	JLabel jl3=new JLabel("Customer Phone");
	public Font f;
	Home h;
	CustomerService cs=new CustomerService();
   public AddCustomer(Home h){
   	this.h=h;
        setTitle("Add Customer");
        setSize(800,600);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jl.setBounds(200,20,600,80);
		add(jl);
		home.setBounds(305,400,80,30);
		add(home);
		f=new Font("Serif",Font.BOLD,18);
		jl.setFont(f);
		
		jl1.setBounds(200,100,100,30);
		add(jl1);
		customerId.setBounds(305,100,100,30);
		add(customerId);
		
		jl2.setBounds(200,180,100,30);
		add(jl2);
		customerName.setBounds(305,180,100,30);
		add(customerName);
		
		jl3.setBounds(200,260,100,30);
		add(jl3);
		customerPhone.setBounds(305,260,100,30);
		add(customerPhone);
		
		jb.setBounds(305,340,80,30);
		add(jb);

			jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
				if(customerId.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Id Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(customerName.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Name Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(customerPhone.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"phone Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{

                    if(cs.addNewCustomer(customerId.getText(),customerName.getText(),customerPhone.getText())){
                        JOptionPane.showMessageDialog(null,"Adding Successfull !!","added",JOptionPane.INFORMATION_MESSAGE);
                        h.setVisible(true);
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Adding Failed !!","error",JOptionPane.ERROR_MESSAGE);
                    }
                }
   }
});
			home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	h.setVisible(true);
            	setVisible(false);

				
   }
});
}
}