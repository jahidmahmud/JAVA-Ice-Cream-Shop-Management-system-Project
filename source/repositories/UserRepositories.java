package repositories;
import java.sql.*;
public class UserRepositories{
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    public UserRepositories(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreamshop","root","");
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
	public boolean getUserValidity(String username,String password){
        try{
            query="SELECT * FROM userinfo WHERE User_Name='"+username+"' AND Passward='"+password+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
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
}