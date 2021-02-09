package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;
import java.awt.Font;
public class AddProduct extends JFrame{

    JButton jb=new JButton("Add");
    JTextField PRODUCT_ID=new JTextField();
    JTextField PRODUCT_NAME=new JTextField();
    JTextField PRODUCT_QUANTITY=new JTextField();
    JTextField PRODUCT_PRICE=new JTextField();
    JTextField EXP_DATE=new JTextField();
    JLabel jl=new JLabel("Please Fill Up The Following Requirements");
    JLabel jl1=new JLabel("Product Id");
    JLabel jl2=new JLabel("Product Name");
    JLabel jl3=new JLabel("Product Quantity");
    JLabel jl4=new JLabel("Product Price");
    JLabel jl5=new JLabel("Expire Date");
    ProductService ps=new ProductService();
    JButton home=new JButton("Home");

    //Employees emp;
    ProductRecord pr;
    //String PRODUCT_ID,String PRODUCT_NAME,String PRODUCT_QUANTITY,String PRODUCT_PRICE,String EXP_DATE
 

   public Font f;
   public AddProduct(ProductRecord pr){
        this.pr=pr;
        setTitle("Add Product");
        setSize(800,600);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jl.setBounds(200,20,600,80);
        add(jl);
        f=new Font("Arial",Font.BOLD,18);
        jl.setFont(f);
        
        jl1.setBounds(200,100,100,30);
        add(jl1);

        home.setBounds(400,500,80,30);
        add(home);



        PRODUCT_ID.setBounds(305,100,100,30);
        add(PRODUCT_ID);
        
        jl2.setBounds(200,180,100,30);
        add(jl2);
        PRODUCT_NAME.setBounds(305,180,100,30);
        add(PRODUCT_NAME);
        
        jl3.setBounds(200,260,100,30);
        add(jl3);
        PRODUCT_QUANTITY.setBounds(305,260,100,30);
        add(PRODUCT_QUANTITY);
        
        jl4.setBounds(200,340,100,30);
        add(jl4);
        PRODUCT_PRICE.setBounds(305,340,100,30);
        add(PRODUCT_PRICE);
        
        jl5.setBounds(200,420,100,30);
        add(jl5);
        EXP_DATE.setBounds(305,420,100,30);
        add(EXP_DATE);
        
        jb.setBounds(305,500,80,30);
        add(jb);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(PRODUCT_ID.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Id Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(PRODUCT_NAME.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Name Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(PRODUCT_QUANTITY.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Quantity Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(PRODUCT_PRICE.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"PPrice Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(EXP_DATE.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Expire Date  Required !!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{

                    if(ps.addNewProduct(PRODUCT_ID.getText(),PRODUCT_NAME.getText(),PRODUCT_QUANTITY.getText(),PRODUCT_PRICE.getText(),EXP_DATE.getText())){
                        JOptionPane.showMessageDialog(null,"Adding Successfull !!","Verified",JOptionPane.INFORMATION_MESSAGE);
                        pr.setVisible(true);
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Adding Failed !!","Verification Denied",JOptionPane.ERROR_MESSAGE);
                        pr.setVisible(true);
                        setVisible(false);
                    }
                }
                
            }
        });

        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           Home h=new Home();
           setVisible(false);

            }});
        

    }
    
}