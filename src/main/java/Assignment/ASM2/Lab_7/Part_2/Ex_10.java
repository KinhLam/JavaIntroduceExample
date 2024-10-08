package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.Objects;

class Product_Ex10{
    String name;
    double price;
    int quantity;

    public Product_Ex10(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_Ex10 that = (Product_Ex10) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Product_Ex10{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
public class Ex_10 {
    public static void main(String[] args) {
        HashSet<Product_Ex10> products = new HashSet<>();
        products.add(new Product_Ex10("Laptop", 1500.99, 5));
        products.add(new Product_Ex10("Dien Thoai", 500.99, 15));

        Product_Ex10 toRemove = new Product_Ex10("Laptop", 1500.99, 5);
        products.remove(toRemove);

        System.out.println("Update");
        products.forEach(System.out::println);
    }
}
