package EcommerceDemo.busniess.concretes;

import EcommerceDemo.busniess.abstracts.ILoggerService;

public class EmailLogger implements ILoggerService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Kay�t ba�ar�l�, hesap onayland�: "+message);
	}

	

}
