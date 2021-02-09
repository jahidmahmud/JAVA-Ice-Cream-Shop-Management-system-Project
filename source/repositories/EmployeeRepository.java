package repositories;
import java.util.ArrayList;
import java.sql.*;
public class EmployeeRepository{
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    public EmployeeRepository(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreamshop","root","");
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public boolean insertEmployeeIntoDB(String ID,String NAME,String EMAIL,String PHONE_NUMBER,String SALARY){
        try{
            query="INSERT INTO employees(ID,NAME,EMAIL,PHONE_NUMBER,SALARY) VALUES('"+ID+"','"+NAME+"','"+EMAIL+"','"+PHONE_NUMBER+"','"+SALARY+"')";
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

    public boolean removeEmployee(String ID){
        try{
            query="DELETE FROM EMPLOYEES WHERE id='"+ID+"'";
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



    public String[][] employeeDetailsFromDB(){
        ArrayList<EmployeesFrame> ar=new ArrayList<EmployeesFrame>();
        query="SELECT * FROM employees";
        
        try{
            rs=stmt.executeQuery(query);
            while(rs.next()){
                String id = rs.getString("ID");
                String name = rs.getString("NAME");
                String email = rs.getString("EMAIL");
                String phone = rs.getString("PHONE_NUMBER");
                String salary = rs.getString("SALARY");
               
                EmployeesFrame ef = new EmployeesFrame( id,name,email,phone,salary);
                ar.add(ef);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        Object obj[] = ar.toArray();
        String data[][] = new String[ar.size()][5];
        
        for(int i=0; i<obj.length; i++)
        {
            
        
            data[i][0] = ((EmployeesFrame)obj[i]).getId();
            data[i][1] = ((EmployeesFrame)obj[i]).getName();
            data[i][2] = ((EmployeesFrame)obj[i]).getPhone();
            data[i][3] = ((EmployeesFrame)obj[i]).getEmail();
            data[i][4] = ((EmployeesFrame)obj[i]).getSalary();
            
        }
        return data;
    }

    }




