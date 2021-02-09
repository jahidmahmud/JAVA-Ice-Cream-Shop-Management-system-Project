package repositories;
public class Customers{
    
    private String cId;
    private String cName;
    private String cPhone;
    
    public Customers(String cId,String cName,String cPhone){
        this.cId = cId;
        this.cName = cName;
        this.cPhone = cPhone;
    }
    
    public String getId(){
        return this.cId;
    }
    
    public String getName(){
        return this.cName;
    }
    
    public String getPhone(){
        return this.cPhone;
    }
   
}
