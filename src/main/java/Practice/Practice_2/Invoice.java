package Practice.Practice_2;

public class Invoice {
    RentalContract rentalContract;
    double totalCost;
    double taxes;
    double discounts;

    public Invoice() {
    }

    public Invoice(RentalContract rentalContract, double totalCost, double taxes, double discounts) {
        this.rentalContract = rentalContract;
        this.totalCost = totalCost;
        this.taxes = taxes;
        this.discounts = discounts;
    }

    public RentalContract getRentalContract() {
        return rentalContract;
    }

    public void setRentalContract(RentalContract rentalContract) {
        this.rentalContract = rentalContract;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }
}
