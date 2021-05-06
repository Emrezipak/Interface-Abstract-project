package EcommerceDemo.busniess.concretes;

import EcommerceDemo.busniess.abstracts.ILoggerService;

public class EmailLogger implements ILoggerService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Kayýt baþarýlý, hesap onaylandý: "+message);
	}

	

}
