package SalesGame;

public class SalesManager implements GameSale {

	
	private Discount discount;
	
	public SalesManager(Discount discount) {
		this.discount = discount;
	}


	@Override
	public void sales(Gamer gamer,Game game) {
		System.out.println(gamer.getName()+" isimli oyuncu tarafýndan "+game.getGameName()+" oyunu satýldý");
		System.out.println("Ürün fiyatý : "+game.getPrice());
	    System.out.println("Ýndirimli fiyatý : "+game.getPrice()*discount.addDiscount());
	}

}
