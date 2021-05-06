package EcommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import EcommerceDemo.dataAccess.abstracts.IDatabaseDao;
import EcommerceDemo.entities.concretes.User;

public class UserControlDao implements IDatabaseDao{

	List<User> controlUser=new ArrayList<User>();
	@Override
	public void add(User user) {
		controlUser.add(user);
	}

	@Override
	public void delete(User user) {
      user=controlUser.remove(user.getId());
      System.out.println(user.getName()+" isimli kullanýcý silindi...");
	}

	@Override
	public boolean getControl(String mail) {
		
		for(User user:controlUser) {
			
			if(user.getE_Mail().equals(mail)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getUser() {
		
		return controlUser;
	}

}
