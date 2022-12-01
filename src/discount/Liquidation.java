package discount;

public class Liquidation implements PricePercentageStrategy {

	@Override
	public double calculateBill(double billAmount) {
		return billAmount - (billAmount * 0.75);
	}

	@Override
	public char getDiscountType() {
		return 'L';
	}

}
