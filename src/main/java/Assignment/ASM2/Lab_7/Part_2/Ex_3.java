package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
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
        return "Product_Ex3{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        HashSet<Product_Ex3> products = new HashSet<>();
        products.add(new Product_Ex3("Laptop", 1500.99, 5));
        products.add(new Product_Ex3("Dien Thoai", 500.99, 15));

        Product_Ex3 search = new Product_Ex3("Laptop", 1500.99, 5);
        System.out.println("Constain Laptop: " + products.contains(search));
    }
}
