package Assignment.ASM2.Lab_7.Part_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class Product_Ex8 {
    private String name;
    private String category;
    private double price;

    public Product_Ex8(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_Ex8 product = (Product_Ex8) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}

public class Ex_8 {
    public static void main(String[] args) {
        HashMap<String, List<Product_Ex8>> productMap = new HashMap<>();

        Product_Ex8 laptop = new Product_Ex8("Laptop", "Electronics", 1000.0);
        Product_Ex8 phone = new Product_Ex8("Phone", "Electronics", 700.0);
        Product_Ex8 apple = new Product_Ex8("Apple", "Fruits", 1.5);
        Product_Ex8 banana = new Product_Ex8("Banana", "Fruits", 0.8);

        productMap.computeIfAbsent("Electronics", k -> new ArrayList<>()).add(laptop);
        productMap.computeIfAbsent("Electronics", k -> new ArrayList<>()).add(phone);
        productMap.computeIfAbsent("Fruits", k -> new ArrayList<>()).add(apple);
        productMap.computeIfAbsent("Fruits", k -> new ArrayList<>()).add(banana);

        List<Product_Ex8> electronics = productMap.get("Electronics");
        System.out.println("Products in Electronics category: " + electronics);
    }
}
