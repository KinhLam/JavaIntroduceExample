package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Product_Ex5 implements Comparable<Product_Ex5> {
    String name;
    double price;
    int quantity;

    public Product_Ex5(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product_Ex5 o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Product_Ex5{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
public class Ex_5 {
    public static void main(String[] args) {
        TreeSet<Product_Ex5> products = new TreeSet<Product_Ex5>();
        products.add(new Product_Ex5("Phone", 500, 10));
        products.add(new Product_Ex5("Laptop", 1500, 10));
        products.add(new Product_Ex5("Televition", 1900, 10));

        System.out.println("Cheaper: " + products.first());
        System.out.println("Most Expensive: " + products.last());
    }
}
