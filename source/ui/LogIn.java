package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;
public class LogIn extends JFrame{
JLabel user=new JLabel("Username ");
JLabel headl=new JLabel("Welcome to the Icecream Shop Management System  ");
JLabel pass=new JLabel("Password ");
JTextField username=new JTextField();
JPasswordField password=new JPasswordField();
JCheckBox jcb=new JCheckBox("Show Password");
JButton login=new JButton("LOGIN");
JButton reset=new JButton("RESET");
LoginServices ls=new LoginServices();

public LogIn(){
setVisible(true);
setSize(600,400);
setTitle("Login Form");
setLocationRelativeTo(null);
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);

user.setBounds(100,105,80,40);
add(user);
pass.setBounds(100,155,80,40);
add(pass);

username.setBounds(190,110,120,30);
add(username);
password.setBounds(190,160,120,30);
add(password);
password.setEchoChar('*');

headl.setBounds(80,40,500,60);
add(headl);

jcb.setBounds(190,195,150,15);
add(jcb);

login.setBounds(120,230,80,30);
add(login);

reset.setBounds(220,230,80,30);
add(reset);

jcb.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
	password.setEchoChar((char) 0);
            
        }
 	else {
	password.setEchoChar('*');
             
        }
    }
});
	login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(username.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Username Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(password.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Password Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(ls.userValidation(username.getText(),password.getText())){
                        JOptionPane.showMessageDialog(null,"Login Successfull !!","Verified",JOptionPane.INFORMATION_MESSAGE);
                        Home home=new Home();
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Login Failed !!","Verification Denied",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }
        });
		
	reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				username.setText("");
				password.setText("");
				
				}});


}
public static void main(String [] args){
	LogIn li=new LogIn();
}

}
