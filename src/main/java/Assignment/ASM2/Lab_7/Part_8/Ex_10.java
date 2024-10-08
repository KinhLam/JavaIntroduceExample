package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Product_Ex10 implements Comparable<Product_Ex10> {
    String name;
    double price;
    String category;

    public Product_Ex10(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public int compareTo(Product_Ex10 o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Product_Ex10{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
public class Ex_10 {
    public static void main(String[] args) {
        TreeSet<Product_Ex10> products = new TreeSet<>();
        products.add(new Product_Ex10("Laptop", 1500, "Electronic"));
        products.add(new Product_Ex10("Phone", 500, "Electronic"));
        products.add(new Product_Ex10("Television", 1900, "Electronic"));

        System.out.println("Before Remove: ");
        for (Product_Ex10 p : products) {
            System.out.println(p);
        }

        products.remove(new Product_Ex10("Laptop", 1500, "Electronic"));
        System.out.println("After Remove: ");
        for (Product_Ex10 p : products) {
            System.out.println(p);
        }
    }
}
