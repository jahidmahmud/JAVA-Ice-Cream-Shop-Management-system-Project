package ui;
import java.awt.event.*;
import javax.swing.*;
public class Employees extends JFrame{
	JButton empInfo=new JButton("Employee Info");
	JButton addEmp=new JButton("Add Employee");
	JButton remvEmp=new JButton("Remove Employee");
	private JButton home=new JButton("Home");
	Home h;
	//Employees employees;
	Employees emp;
	
	public Employees(Home h){
		this.h=h;
		setTitle("Employees");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		empInfo.setBounds(150,150,150,30);
		add(empInfo);
		home.setBounds(150,350,100,30);
		add(home);
		//jb.addActionListener(this);
		
		addEmp.setBounds(150,200,150,30);
		add(addEmp);
		addEmp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           AddEmployee am=new AddEmployee(emp);
           setVisible(false);

            }});
		
	//	jb1.addActionListener(this);
		
		remvEmp.setBounds(150,250,150,30);
		add(remvEmp);
		remvEmp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           RemoveEmployee rmv1=new RemoveEmployee(emp);
           setVisible(false);

            }});
		

		empInfo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           EmployeeDetails ed=new EmployeeDetails(emp);
           setVisible(false);

            }});

		home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                h.setVisible(true);
                setVisible(false);
            }
        });


		
		
	}

	
}