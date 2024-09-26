package Lab.OOP.Days.Ex_1_CoffeeManagement;

public class BeverageTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", 2.5, true);
        Tea tea = new Tea("Green Tea", 1.5, false);
        String[] fruits = {"Banana", "Strawberry", "Mango"};
        Smoothie smoothie = new Smoothie("Fruits smoothie", 4.0, fruits);

        System.out.println("Beverage: " + coffee.getName() + ", Price: $" + coffee.getPrice());
        coffee.makeBeverage();

        System.out.println("\nBeverage: " + tea.getName() + ", Price: $" + tea.getPrice());
        tea.makeBeverage();

        System.out.println("\nBeverage: " + smoothie.getName() + ", Price: $" + smoothie.getPrice());
        smoothie.makeBeverage();
    }
}
