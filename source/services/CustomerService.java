package services;
import repositories.*;
public class CustomerService{
    CustomerRepository cusRepository=new CustomerRepository();
    public boolean addNewCustomer(String ID,String NAME,String PHONE){
        return cusRepository.insertCustomerIntoDB(ID,NAME,PHONE);
    }

     public String[][] customerDetails(){
		return cusRepository.customerDetailsFromDB();
	}
}