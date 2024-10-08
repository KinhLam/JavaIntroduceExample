package Assignment.ASM2.Lab_7.Part_7;

import java.util.TreeSet;

class Product_Ex5 implements Comparable<Product_Ex5> {
    String name;
    double price;

    public Product_Ex5(String name, double price) {
        this.name = name;
        this.price = price;
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
                '}';
    }
}
public class Ex_5 {
    public static void main(String[] args) {
        TreeSet<Product_Ex5> products = new TreeSet<Product_Ex5>();
        products.add(new Product_Ex5("Apple", 15.0));
        products.add(new Product_Ex5("Banana", 12.0));
        products.add(new Product_Ex5("Orange", 15.0));

        System.out.println("Product sorted: ");
        for (Product_Ex5 p : products) {
            System.out.println(p);
        }
    }
}
