package EcommerceDemo.busniess.abstracts;

import EcommerceDemo.entities.concretes.User;

public interface IUserService {
	
	void login(String Email,String password);
	void signUp(User user);
	void delete(User user);

}
