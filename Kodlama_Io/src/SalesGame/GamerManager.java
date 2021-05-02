package SalesGame;

public class GamerManager extends BaseLoggerManager{
	
	private GamerCheckService checkService;
		
	public GamerManager(GamerCheckService checkService) {
		this.checkService = checkService;
	}


	@Override
	public void sign(Gamer gamer) {		
		
		if(checkService.control(gamer)) {
			super.sign(gamer);
		}
		else {
			throw new NullPointerException("Yaþýnýz 18 yaþýndan küçük");
		}
	}

	
	

}
