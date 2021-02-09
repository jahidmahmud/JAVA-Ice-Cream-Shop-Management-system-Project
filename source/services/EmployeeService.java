package services;
import repositories.*;
public class EmployeeService{
    EmployeeRepository employeeRepository=new EmployeeRepository();
    public boolean addNewEmployee(String ID,String NAME,String EMAIL,String PHONE_NUMBER,String SALARY){
        return employeeRepository.insertEmployeeIntoDB(ID,NAME,EMAIL,PHONE_NUMBER,SALARY);
    }

    public String[][] employeeDetails(){
		return employeeRepository.employeeDetailsFromDB();
	}
}