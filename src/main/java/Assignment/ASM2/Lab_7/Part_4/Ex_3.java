package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Product_Ex3{
    String name;
    double price;
    int quantity;

    public Product_Ex3(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_Ex3 that = (Product_Ex3) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Product_Ex4{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
public class Ex_3 {
    public static void main(String[] args) {
        HashMap<String, Product_Ex3> productMap = new HashMap<>();
        productMap.put("Laptop", new Product_Ex3("Laptop", 1000.0, 5));
        productMap.put("Phone", new Product_Ex3("Phone", 700.0, 10));

        Product_Ex3 product = productMap.get("Phone");
        System.out.println("Retrieved Product: " + product);
    }
}
