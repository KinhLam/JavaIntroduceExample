package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Order_Ex7{
    String orderNumber;
    String customer;
    double totalAmount;

    public Order_Ex7(String orderNumber, String customer, double totalAmount) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order_Ex7 orderEx7 = (Order_Ex7) o;
        return Objects.equals(orderNumber, orderEx7.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderNumber);
    }

    @Override
    public String toString() {
        return "Order_Ex7{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

public class Ex_7 {
    public static void main(String[] args) {
        HashMap<String, Order_Ex7> orderMap = new HashMap<>();
        orderMap.put("ORD123", new Order_Ex7("ORD123", "Kinh", 250.75));
        orderMap.put("ORD456", new Order_Ex7("ORD456", "Lam", 499.99));

        Order_Ex7 order = orderMap.get("ORD123");
        System.out.println(order);
    }
}
