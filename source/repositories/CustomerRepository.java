package repositories;
import java.util.ArrayList;
import java.sql.*;
public class CustomerRepository{
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    public CustomerRepository(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreamshop","root","");
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public boolean insertCustomerIntoDB(String ID,String NAME,String PHONE){
        try{
            query="INSERT INTO customerinfo(CUSTOMER_ID,CUSTOMER_NAME ,CUSTOMER_PHONE) VALUES('"+ID+"','"+NAME+"','"+PHONE+"')";
            int i=stmt.executeUpdate(query);
            if(i==1){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }

    }



    public String[][] customerDetailsFromDB(){
        ArrayList<Customers> ar=new ArrayList<Customers>();
        query="SELECT * FROM customerinfo";
        
        try{
            rs=stmt.executeQuery(query);
            while(rs.next()){
                String cId = rs.getString("CUSTOMER_ID");
                String cName = rs.getString("CUSTOMER_NAME");
                String cPhone = rs.getString("CUSTOMER_PHONE");
                
                Customers cr = new Customers(cId,cName,cPhone);
                ar.add(cr);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        Object obj[] = ar.toArray();
        String data[][] = new String[ar.size()][3];
        
        for(int i=0; i<obj.length; i++)
        {
           
            data[i][0] = ((Customers)obj[i]).getId();
            data[i][1] = ((Customers)obj[i]).getName();
            data[i][2] = ((Customers)obj[i]).getPhone();
            
            
        }
        return data;
    }
}
