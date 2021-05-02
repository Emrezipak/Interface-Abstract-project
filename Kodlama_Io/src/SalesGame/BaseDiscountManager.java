package SalesGame;

public abstract  class BaseDiscountManager  implements Discount{

	@Override
	public double addDiscount() {
		return 0;
	}

	@Override
	public double insertDiscount(double percent) {
		return percent;
	}

	@Override
	public double deleteDiscount() {
		return 0;
	}

}
