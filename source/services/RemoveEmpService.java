package services;
import repositories.*;
public class RemoveEmpService{
    EmployeeRepository employeeRepository=new EmployeeRepository();
    public boolean removeEmployee(String ID){
        return employeeRepository.removeEmployee(ID);
    }
}