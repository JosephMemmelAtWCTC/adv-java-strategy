package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private PricePercentageStrategy pricePercentageStrategy;

    public CustomerOrder(String customerName, double billAmount, PricePercentageStrategy pricePercentageStrategy) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.setDiscountStrategy(pricePercentageStrategy);
    }

    public double getBillAmount() {
        return pricePercentageStrategy.calculateBill(billAmount);
    }

    public void setDiscountStrategy(PricePercentageStrategy pricePercentageStrategy){this.pricePercentageStrategy = pricePercentageStrategy;}

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + pricePercentageStrategy.getDiscountType()
                + '}';
    }
}
