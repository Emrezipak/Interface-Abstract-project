package EcommerceDemo.core;

import EcommerceDemo.googleLogger.GoogleLoggerManager;

public class LogServiceAdapter implements ILogServices {

	private GoogleLoggerManager googleLogger;
	//Dependency injection kulland�m
	public LogServiceAdapter(GoogleLoggerManager googleLogger) {
		this.googleLogger = googleLogger;
	}

	@Override
	public void logger(String message) {
		
		googleLogger.login(message);
	}

}
