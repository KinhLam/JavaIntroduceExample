package Assignment.ASM2.Lab_7.Part_6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Product_Ex8 implements Comparable<Product_Ex8> {
    String name;
    String category;
    double price;

    public Product_Ex8(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public int compareTo(Product_Ex8 o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Product_Ex8{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Ex_8 {
    public static void main(String[] args) {
        TreeMap<Double, List<Product_Ex8>> productMap = new TreeMap<>();
        List<Product_Ex8> elec = new ArrayList<>();
        elec.add(new Product_Ex8("Phone", "Electronics", 100.0));
        elec.add(new Product_Ex8("Laptop", "Electronics", 200.0));

        List<Product_Ex8> elec1 = new ArrayList<>();
        elec1.add(new Product_Ex8("Chair", "Furniture", 100.0));
        elec1.add(new Product_Ex8("Table", "Furniture", 200.0));

        productMap.put(1500.00, elec);
        productMap.put(500.00, elec1);
        for(List<Product_Ex8> productList : productMap.values()) {
            for(Product_Ex8 product : productList) {
                System.out.println(product);
            }
        }
    }
}
