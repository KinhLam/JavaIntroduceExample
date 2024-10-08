package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.TreeSet;

class Product_Ex7 implements Comparable<Product_Ex7> {
    String name;
    double price;
    String category;

    public Product_Ex7(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public int compareTo(Product_Ex7 o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Product_Ex7{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
public class Ex_7 {
    public static void main(String[] args) {
        HashSet<Product_Ex7> products = new HashSet<>();
        products.add(new Product_Ex7("Laptop", 15.990, "Điện Tử"));
        products.add(new Product_Ex7("Điện Thoại", 5.990, "Điện Tử"));
        products.add(new Product_Ex7("Chuột Máy Tính", 1.990, "Phụ Kiện"));
        TreeSet<Product_Ex7> sortedProducts = new TreeSet<>(products);
        Product_Ex7 cheapest = sortedProducts.first();
        Product_Ex7 mostExpensive = sortedProducts.last();

        System.out.println("Cheapest Product: " + cheapest);
        System.out.println("Most Expensive Product: " + mostExpensive);
    }
}
