package Lab.OOP.Days.Ex_1_CoffeeManagement;

public class Coffee extends Beverage{
    private boolean hasMilk;

    public Coffee(String name, double price, boolean hasMilk) {
        super(name, price);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    public void makeBeverage() {
        System.out.println("Making coffee with" + (hasMilk ? "milk" : "out milk"));
    }
}
