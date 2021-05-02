package SalesGame;

public class SalesManager implements GameSale {

	
	private Discount discount;
	
	public SalesManager(Discount discount) {
		this.discount = discount;
	}


	@Override
	public void sales(Gamer gamer,Game game) {
		System.out.println(gamer.getName()+" isimli oyuncu taraf�ndan "+game.getGameName()+" oyunu sat�ld�");
		System.out.println("�r�n fiyat� : "+game.getPrice());
	    System.out.println("�ndirimli fiyat� : "+game.getPrice()*discount.addDiscount());
	}

}
