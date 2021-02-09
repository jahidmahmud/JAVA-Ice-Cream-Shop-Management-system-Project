package repositories;
import java.util.ArrayList;
import java.sql.*;
public class ProductRepositories{
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    public ProductRepositories(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreamshop","root","");
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


   

         public boolean insertProductIntoDB(String PRODUCT_ID,String PRODUCT_NAME,String PRODUCT_QUANTITY,String PRODUCT_PRICE,String EXP_DATE){
            
        try{
            query="INSERT INTO productinfo(PRODUCT_ID,PRODUCT_NAME,PRODUCT_QUANTITY,PRODUCT_PRICE,EXP_DATE) VALUES('"+PRODUCT_ID+"','"+PRODUCT_NAME+"','"+PRODUCT_QUANTITY+"','"+PRODUCT_PRICE+"','"+EXP_DATE+"')";
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

    
    public String[][] productDetailsFromDB(){
        ArrayList<Product> ar=new ArrayList<Product>();
        query="SELECT * FROM productinfo";
        
        try{
            rs=stmt.executeQuery(query);
            while(rs.next()){
                String id = rs.getString("PRODUCT_ID");
                String name = rs.getString("PRODUCT_NAME");
                String quantity = rs.getString("PRODUCT_QUANTITY");
                String price = rs.getString("PRODUCT_PRICE");
                String exp = rs.getString("EXP_DATE");
               
                Product p = new Product(id,name,quantity,price,exp);
                ar.add(p);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        Object obj[] = ar.toArray();
        String data[][] = new String[ar.size()][5];
        
        for(int i=0; i<obj.length; i++)
        {
            
        
            data[i][0] = ((Product)obj[i]).getID();
            data[i][1] = ((Product)obj[i]).getName();
            data[i][2] = ((Product)obj[i]).getQuantity();
            data[i][3] = ((Product)obj[i]).getPrice();
            data[i][4] = ((Product)obj[i]).getExpDate();
            
        }
        return data;
    }
    public void updateProduct(int num1,int num2,int num3){
            String vanQuery="SELECT * FROM productinfo WHERE PRODUCT_NAME='Vanilla'";
            String cbQuery="SELECT * FROM productinfo WHERE PRODUCT_NAME='Chocobar'";
            String cnQuery="SELECT * FROM productinfo WHERE PRODUCT_NAME='Cone'";

            String stVan,stCb,stCn;
            int intVan=10,intVCb=10,intVCn=10;
            try{
                rs=stmt.executeQuery(vanQuery);
                while(rs.next()){
                    stVan=rs.getString("PRODUCT_QUANTITY");
                    intVan=Integer.parseInt(stVan);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                rs=stmt.executeQuery(cbQuery);
                while(rs.next()){
                    stCb=rs.getString("PRODUCT_QUANTITY");
                    intVCb=Integer.parseInt(stCb);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try{
                rs=stmt.executeQuery(cnQuery);
                while(rs.next()){
                    stCn=rs.getString("PRODUCT_QUANTITY");
                    intVCn=Integer.parseInt(stCn);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            String updateVan="UPDATE productinfo SET PRODUCT_QUANTITY='"+intVan+"'-'"+num1+"' WHERE PRODUCT_NAME='Vanilla'";
            String updateCbar="UPDATE productinfo SET PRODUCT_QUANTITY='"+intVCb+"'-'"+num3+"' WHERE PRODUCT_NAME='Chocobar'";
            String updateCone="UPDATE productinfo SET PRODUCT_QUANTITY='"+intVCn+"'-'"+num2+"' WHERE PRODUCT_NAME='Cone'";
            try{
                stmt.executeUpdate(updateVan);
                stmt.executeUpdate(updateCone);
                stmt.executeUpdate(updateCbar);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }


    }

}




