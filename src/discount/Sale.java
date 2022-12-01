package discount;

public class Sale implements PricePercentageStrategy {

	@Override
	public double calculateBill(double billAmount) {
		return billAmount - (billAmount * 0.1);
	}

	@Override
	public char getDiscountType() {
		return 'S';
	}

}
