package EcommerceDemo.busniess.concretes;

import java.util.regex.Pattern;

import EcommerceDemo.busniess.abstracts.ILoggerService;
import EcommerceDemo.busniess.abstracts.IUserService;
import EcommerceDemo.dataAccess.abstracts.IDatabaseDao;
import EcommerceDemo.entities.concretes.User;

public class UserManager implements IUserService {

	private IDatabaseDao databaseDao;
	private ILoggerService logger;
	public static final Pattern Email_Regex = 
	Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public UserManager(IDatabaseDao databaseDao,ILoggerService logger) {
		this.databaseDao = databaseDao;
		this.logger=logger;
	}

	@Override
	public void login(String email,String password) {
		
		for(User user1:databaseDao.getUser()) {
			if(email.equals(user1.getE_Mail()) && password.equals(user1.getPassword())){
				System.out.println("Giri� ba�ar�l�, ho�geldiniz : "+user1.getName()+" "+user1.getSurname());
				return;
			}
		}
		System.out.println("Kay�tl� kullan�c� bulunamad�...");
	}

	@Override
	public void signUp(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola 6 karakterden k���k olamaz...");
			return;
		}
		if(user.getName().length()<2 || user.getSurname().length()<2) {
			System.out.println("Ad ve Soyad 2 karakterden k���k olamaz");
			return;
		}
		if(databaseDao.getControl(user.getE_Mail())) {
			System.out.println("Bu adreste bir kullan�c� mevcut");
			return;
		}
		if(!Email_Regex.matcher(user.getE_Mail()).find()) {
			System.out.println("Email adresinizi eksiksiz yaz�n�z...");
			return;
		}
			
		databaseDao.add(user);
		logger.sendMessage(user.getName());		
	}
	

	@Override
	public void delete(User user) {
		databaseDao.delete(user);
	}

}
