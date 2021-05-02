package SalesGame;

public class main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer("emre","zipak","134411441",18);
		Game game=new Game("Pubg",1000);
		BaseLoggerManager baseManager=new GamerManager(new GamerCheckManager());
		baseManager.sign(gamer);
		baseManager.deleteAccount(gamer);
		baseManager.insert(gamer);
		SalesManager salesManager=new SalesManager(new WeekdaysDiscount());
		salesManager.sales(gamer, game);
	}

}
