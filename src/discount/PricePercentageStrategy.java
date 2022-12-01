package discount;

public interface PricePercentageStrategy {

	double calculateBill(double billAmount);

	char getDiscountType();
}
