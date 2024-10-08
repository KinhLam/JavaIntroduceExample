package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Product_Ex3 implements Comparable<Product_Ex3> {
    String name;
    double price;
    int quanitty;

    public Product_Ex3(String name, double price, int quanitty) {
        this.name = name;
        this.price = price;
        this.quanitty = quanitty;
    }

    @Override
    public int compareTo(Product_Ex3 o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Product_Ex3{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quanitty=" + quanitty +
                '}';
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        TreeMap<String, Product_Ex3> productMap = new TreeMap<>();
        productMap.put("Laptop", new Product_Ex3("Laptop", 1500, 10));
        productMap.put("Phone", new Product_Ex3("Phone", 1500, 10));
        productMap.put("Televition", new Product_Ex3("Televition", 1500, 10));

        Product_Ex3 pro = productMap.get("Phone");
        System.out.println(pro);
    }
}
