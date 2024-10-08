package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product_Ex2 {
    String name;
    double price;

    public Product_Ex2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product_Ex2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        List<Product_Ex2> products = Arrays.asList(
                new Product_Ex2("Laptop", 1000),
                new Product_Ex2("Phone", 700),
                new Product_Ex2("Tablet", 300)
        );
        products.sort(Comparator.comparingDouble(Product_Ex2::getPrice).reversed());

        System.out.println("Sorted list: " + products);
    }
}
