package Lab.OOP.Days.Ex_1_CoffeeManagement;

public class Tea extends Beverage{
    private boolean hasSugar;

    public Tea(String name, double price, boolean hasSugar) {
        super(name, price);
        this.hasSugar = hasSugar;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    @Override
    public void makeBeverage() {
        System.out.println("Making tea with "+ (hasSugar ? "sugar" : "out sugar"));
    }
}
