package repositories; 

class Product{
    
    private String id;
    private String name;
    private String quantity;
    private String price;
    private String expDate;
    
    public Product(String id,String name,String quantity,String price,String expDate){
        this.id = id;
        this.name = name;
        this.quantity=quantity;
        this.price=price;
        this.expDate=expDate;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getQuantity(){
        return this.quantity;
    }
    
    public String getPrice(){
        return this.price;
    } 
    public String getExpDate(){
        return this.expDate;
    } 
}