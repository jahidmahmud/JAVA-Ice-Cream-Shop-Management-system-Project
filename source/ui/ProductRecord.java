package ui;
import repositories.*;
import javax.swing.*;
import java.awt.event.*;
public class ProductRecord extends JFrame{
		JButton details =new JButton("Product Details");
		JButton addProduct =new JButton("Add Product");
		JButton home=new JButton("Home");



		Home h;
		ProductRecord pr;

		public ProductRecord(Home h){
		this.h=h;
		pr=this;
		setVisible(true);
		setSize(500,400);
		setTitle("Product Information");
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		details.setBounds(110,70,150,40);
		add(details);
		addProduct.setBounds(110,120,150,40);
		add(addProduct);
		home.setBounds(140,200,80,30);
		add(home);
		
		addProduct.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           AddProduct ap=new AddProduct(pr);
           pr.setVisible(false);

            }});
		details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           ProductDetails pd=new ProductDetails();
           pr.setVisible(false);

            }});


			home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           h.setVisible(true);
           pr.setVisible(false);

            }});




	} 
}