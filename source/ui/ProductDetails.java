package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import services.*;
public class ProductDetails extends JFrame implements ActionListener{
	private JLabel titleLabel=new JLabel("Product Details");
	private JTable productDetails;
	private JScrollPane productDetailsScroll;
	private JButton home=new JButton("Home");

	//ProductDetails pr;

	private ProductService ps=new ProductService();
	public ProductDetails(){
		
		setTitle("Product Details");
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		titleLabel.setBounds(230,10,400,80);
        add(titleLabel);
        home.setBounds(370,400,80,30);
        add(home);
        home.addActionListener(this);

        String data[][] = ps.productDetails();
		String title[] = {"ID", "name", "quantity", "price","exp_date"};
			
		productDetails = new JTable(data,title);
		productDetails.setEnabled(false);
		productDetailsScroll = new JScrollPane(productDetails);
		productDetailsScroll.setBounds(50,100,600,200);
		add(productDetailsScroll);



	}

		public void actionPerformed(ActionEvent e){

		 if(e.getSource()==home){
            Home h=new Home();
            this.setVisible(false);
            
        }
    }	
}
