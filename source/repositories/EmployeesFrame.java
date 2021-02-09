package repositories; 

class EmployeesFrame{
    
   
    private String id;
    private String name;
    private String email;
    private String phone;
    private String salary;
    
    public EmployeesFrame(String id,String name,String email,String phone,String salary){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email=email;
        this.salary=salary;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public String getEmail(){
        return this.email;
    } 
    public String getSalary(){
        return this.salary;
    } 
}