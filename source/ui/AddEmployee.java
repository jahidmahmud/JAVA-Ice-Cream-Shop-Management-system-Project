package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;
import java.awt.Font;
public class AddEmployee extends JFrame{
    private JButton home=new JButton("Home");

    JButton jb=new JButton("Add");
    JTextField ID=new JTextField();
    JTextField NAME=new JTextField();
    JTextField EMAIL=new JTextField();
    JTextField PHONE_NUMBER=new JTextField();
    JTextField SALARY=new JTextField();
    JLabel jl=new JLabel("Please Fill Up The Following Requirements");
    JLabel jl1=new JLabel("Employee Id");
    JLabel jl2=new JLabel("Employee Name");
    JLabel jl3=new JLabel("Employee Email");
    JLabel jl4=new JLabel("Employee Phone");
    JLabel jl5=new JLabel("Employee Salary");
    EmployeeService es=new EmployeeService();
    Employees emp;
 

   public Font f;
   public AddEmployee(Employees emp){
        this.emp=emp;
        setTitle("Add Employee");
        setSize(800,700);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jl.setBounds(200,20,600,80);
        add(jl);

        home.setBounds(305,540,80,30);
        add(home);
        f=new Font("Arial",Font.BOLD,18);
        jl.setFont(f);
        
        jl1.setBounds(200,100,100,30);
        add(jl1);
        ID.setBounds(305,100,100,30);
        add(ID);
        
        jl2.setBounds(200,180,100,30);
        add(jl2);
        NAME.setBounds(305,180,100,30);
        add(NAME);
        
        jl3.setBounds(200,260,100,30);
        add(jl3);
        EMAIL.setBounds(305,260,100,30);
        add(EMAIL);
        
        jl4.setBounds(200,340,100,30);
        add(jl4);
        PHONE_NUMBER.setBounds(305,340,100,30);
        add(PHONE_NUMBER);
        
        jl5.setBounds(200,420,100,30);
        add(jl5);
        SALARY.setBounds(305,420,100,30);
        add(SALARY);
        
        jb.setBounds(305,500,80,30);
        add(jb);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ID.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Id Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(NAME.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Name Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(EMAIL.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Email Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(PHONE_NUMBER.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Phone Number Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(SALARY.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Salary  Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{

                    if(es.addNewEmployee(ID.getText(),NAME.getText(),EMAIL.getText(),PHONE_NUMBER.getText(),SALARY.getText())){
                        JOptionPane.showMessageDialog(null,"Adding Successfull !!","Verified",JOptionPane.INFORMATION_MESSAGE);
                        Home h=new Home();
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Adding Failed !!","Verification Denied",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }
        });

      home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Home h=new Home();
                setVisible(false);
            }
        });  
        

    }
    
}