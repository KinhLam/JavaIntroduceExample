package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Product{
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}


public class Ex_28 {
    LinkedList<Product> products = new LinkedList<>();
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.id == id);
    }

    public void updateProductQuantity(int id, int newQuantity) {
        for (Product product : products) {
            if (product.id == id) {
                product.quantity = newQuantity;
                return;
            }
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void findLowQuantityProducts(int threshold) {
        System.out.println("Products with quantity less than " + threshold + ":");
        for (Product product : products) {
            if (product.quantity < threshold) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        Ex_28 list = new Ex_28();
        list.addProduct(new Product(1, "Táo", 50));
        list.addProduct(new Product(2, "Chuối", 20));
        list.addProduct(new Product(3, "Ổi", 5));

        list.displayProducts();
        list.updateProductQuantity(2, 25);
        list.displayProducts();
        list.findLowQuantityProducts(10);
        list.removeProduct(1);
        list.displayProducts();
    }
}
