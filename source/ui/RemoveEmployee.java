package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;
import java.awt.Font;
public class RemoveEmployee extends JFrame{
    

    JButton jb=new JButton("Remove");
    JTextField ID=new JTextField();
	JLabel jl=new JLabel("Please Fill Up The Following Requirements");
	JLabel jl1=new JLabel("Employee Id");
	
	RemoveEmpService res= new RemoveEmpService();
	Employees emp1;
	public Font f;
   public RemoveEmployee(Employees emp1){
   	this.emp1=emp1;
        setTitle("Remove Employee");
        setSize(500,300);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jl.setBounds(50,20,500,80);
		add(jl);
		f=new Font("Arial",Font.BOLD,18);
		jl.setFont(f);
		
		jl1.setBounds(100,100,100,30);
		add(jl1);
		ID.setBounds(180,100,100,30);
		add(ID);
		
		jb.setBounds(180,150,80,30);
		add(jb);

		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(ID.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"ID Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                	if(res.removeEmployee(ID.getText())){
                        	JOptionPane.showMessageDialog(null,"Removing Successfull !!","Removed",JOptionPane.INFORMATION_MESSAGE);
                        Home h=new Home();
                        setVisible(false);
                        }
                        else{
                        	JOptionPane.showMessageDialog(null,"Removing unsuccessfull !!","Error",JOptionPane.INFORMATION_MESSAGE);
                        Home h=new Home();
                        setVisible(false);
                        }
                }
			}
		});
		
		
   }
  
}






/*
jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ID.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"ID Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
               
                    else{
                        if(res.removeEmployee(ID.getText())){
                        	JOptionPane.showMessageDialog(null,"Removing Successfull !!","Removed",JOptionPane.INFORMATION_MESSAGE);
                        emp.setVisible(true);
                        setVisible(false);
                        }
                        else{
                        	JOptionPane.showMessageDialog(null,"Removing unsuccessfull !!","Error",JOptionPane.INFORMATION_MESSAGE);
                        emp.setVisible(true);
                        setVisible(false);
                    }
                        }
                    }
                }
                
            
        });*/