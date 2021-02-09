package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import services.*;
public class EmployeeDetails extends JFrame{
	private JLabel titleLabel=new JLabel("Employee Details");
	private JTable employeeDetails;
	private JScrollPane employeeDetailsScroll;
	private JButton home=new JButton("Back");

	private EmployeeService ess=new EmployeeService();
	Employees emp;
	public EmployeeDetails(Employees emp){
		this.emp=emp;
		
		setTitle("Employee Details");
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		titleLabel.setBounds(230,10,400,80);
        add(titleLabel);
        home.setBounds(350,400,80,30);
        add(home);

        String data[][] = ess.employeeDetails();
		String title[] = {"ID", "NAME", "EMAIL","PHONE","SALARY"};
			
		employeeDetails = new JTable(data,title);
		employeeDetails.setEnabled(false);
		employeeDetailsScroll = new JScrollPane(employeeDetails);
		employeeDetailsScroll.setBounds(50,100,600,200);
		add(employeeDetailsScroll);

		home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Home h=new Home();
                setVisible(false);

            }
        });



	}	
}
