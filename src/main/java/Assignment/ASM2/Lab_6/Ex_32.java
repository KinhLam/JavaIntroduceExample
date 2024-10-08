package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class ProductInCart {
    String name;
    double price;
    int quantity;

    public ProductInCart(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

public class Ex_32 {
    String customerName;
    LinkedList<ProductInCart> productList = new LinkedList<>();

    public Ex_32(String customerName) {
        this.customerName = customerName;
    }

    public void addProduct(ProductInCart product) {
        productList.add(product);
    }

    public void removeProduct(String name) {
        productList.removeIf(product -> product.name.equalsIgnoreCase(name));
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (ProductInCart product : productList) {
            total += product.price * product.quantity;
        }
        return total;
    }

    public void displayCartContents() {
        System.out.println("Shopping Cart for " + customerName + ":");
        for (ProductInCart product : productList) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Ex_32 cart = new Ex_32("John Doe");
        cart.addProduct(new ProductInCart("Apple", 0.99, 3));
        cart.addProduct(new ProductInCart("Banana", 0.59, 5));

        cart.displayCartContents();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        cart.removeProduct("Banana");
        System.out.println("After removing Banana:");
        cart.displayCartContents();
    }
}
