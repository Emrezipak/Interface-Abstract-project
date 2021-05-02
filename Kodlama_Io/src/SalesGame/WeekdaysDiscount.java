package SalesGame;

public class WeekdaysDiscount extends BaseDiscountManager{

	@Override
	public double addDiscount() {
		System.out.println("Hafta içi indirimi uygulandý...");
		return 0.95;
	}

}
