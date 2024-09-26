package Lab.OOP.Days.Ex_1_CoffeeManagement;

public class Smoothie extends Beverage{
    private String[] fruits;

    public Smoothie(String name, double price, String[] fruits) {
        super(name, price);
        this.fruits = fruits;
    }

    public String[] getFruits() {
        return fruits;
    }

    public void setFruits(String[] fruits) {
        this.fruits = fruits;
    }

    @Override
    public void makeBeverage() {
        System.out.println("Making smoothie with fruits: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
