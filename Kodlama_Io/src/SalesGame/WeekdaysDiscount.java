package SalesGame;

public class WeekdaysDiscount extends BaseDiscountManager{

	@Override
	public double addDiscount() {
		System.out.println("Hafta i�i indirimi uyguland�...");
		return 0.95;
	}

}
