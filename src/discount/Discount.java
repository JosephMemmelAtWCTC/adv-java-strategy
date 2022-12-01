package discount;

public class Discount implements PricePercentageStrategy {

	@Override
	public double calculateBill(double billAmount) {
		return billAmount - (billAmount * 0.5);
	}

	@Override
	public char getDiscountType() {
		return 'D';
	}

}
