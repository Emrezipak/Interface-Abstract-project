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
	//kay�t ekran�
	userService.signUp(new User("Emre","zipak","emrezpk@gmail.com","22224343",1));//do�ru kay�t
	userService.signUp(new User("Hakan","Akman","hkn_fd@gmail.com","22224343",6));//do�ru kay�t
	userService.signUp(new User("Yunus","akman","zkaksakkada","144441",3));//mail yanl��
	userService.signUp(new User("Hakan","akman","zkaksakkada@gmail.com","21331",2));//Parola 6 haneden k���k
	userService.signUp(new User("Emre","zipak","emrezpk@gmail.com","121212",4));//Bu mail hesab�nda bir kullan�c kay�tl�
	userService.signUp(new User("E","z","1232122@gmail.com","121212",5));//Ad soyad 2 karakterden k���k olamaz.

	User user=new User("Emre","zipak","zpk@gmail.com","zpk123",7);
	userService.signUp(user);
	userService.delete(user);//user silindi
	
	ILogServices googleServices=new LogServiceAdapter(new GoogleLoggerManager());
	googleServices.logger("Emre zipak");//google hesab� ile giri�
	
	System.out.print("kullanici ad� : ");
	String kullaniciAdi=scanner.nextLine();
	System.out.print("�ifre : ");
	String password=scanner.nextLine();
	userService.login(kullaniciAdi, password); //Giri� ekran� 

	}

}
