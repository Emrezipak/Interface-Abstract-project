package EcommerceDemo.dataAccess.abstracts;

import java.util.List;

import EcommerceDemo.entities.concretes.User;

public interface IDatabaseDao {
	
	void add(User user);
	void delete(User user);
	boolean getControl(String mail);
	List<User> getUser();
}
