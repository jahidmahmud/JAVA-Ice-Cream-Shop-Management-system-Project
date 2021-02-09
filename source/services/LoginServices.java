package services;
import repositories.*;
public class LoginServices{
	UserRepositories userRepository=new UserRepositories();
	public boolean userValidation(String username, String password){
		return userRepository.getUserValidity(username,password);
	}
	
}