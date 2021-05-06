package EcommerceDemo;

import java.util.Scanner;

import EcommerceDemo.busniess.abstracts.IUserService;
import EcommerceDemo.busniess.concretes.EmailLogger;
import EcommerceDemo.busniess.concretes.UserManager;
import EcommerceDemo.core.ILogServices;
import EcommerceDemo.core.LogServiceAdapter;
import EcommerceDemo.dataAccess.concretes.UserControlDao;
import EcommerceDemo.entities.concretes.User;
import EcommerceDemo.googleLogger.GoogleLoggerManager;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

	IUserService userService=new UserManager(new UserControlDao(),new EmailLogger());
	//kayýt ekraný
	userService.signUp(new User("Emre","zipak","emrezpk@gmail.com","22224343",1));//doðru kayýt
	userService.signUp(new User("Hakan","Akman","hkn_fd@gmail.com","22224343",6));//doðru kayýt
	userService.signUp(new User("Yunus","akman","zkaksakkada","144441",3));//mail yanlýþ
	userService.signUp(new User("Hakan","akman","zkaksakkada@gmail.com","21331",2));//Parola 6 haneden küçük
	userService.signUp(new User("Emre","zipak","emrezpk@gmail.com","121212",4));//Bu mail hesabýnda bir kullanýc kayýtlý
	userService.signUp(new User("E","z","1232122@gmail.com","121212",5));//Ad soyad 2 karakterden küçük olamaz.

	User user=new User("Emre","zipak","zpk@gmail.com","zpk123",7);
	userService.signUp(user);
	userService.delete(user);//user silindi
	
	ILogServices googleServices=new LogServiceAdapter(new GoogleLoggerManager());
	googleServices.logger("Emre zipak");//google hesabý ile giriþ
	
	System.out.print("kullanici adý : ");
	String kullaniciAdi=scanner.nextLine();
	System.out.print("Þifre : ");
	String password=scanner.nextLine();
	userService.login(kullaniciAdi, password); //Giriþ ekraný 

	}

}
