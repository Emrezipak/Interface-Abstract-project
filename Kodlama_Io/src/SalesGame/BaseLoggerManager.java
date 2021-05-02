package SalesGame;

public abstract class BaseLoggerManager implements Logger{

	@Override
	public void sign(Gamer gamer) {
		System.out.println("Sign up : "+gamer.getName());
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println("delete account : "+gamer.getName());
	}

	@Override
	public void insert(Gamer gamer) {
		System.out.println("Insert gamer : "+gamer.getName());

	}
	
	
	

}
