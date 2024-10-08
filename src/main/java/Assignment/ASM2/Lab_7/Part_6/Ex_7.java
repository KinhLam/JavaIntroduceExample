package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Order_Ex7 implements Comparable<Order_Ex7> {
    int orderNumber;
    String customer;
    double totalAmount;

    public Order_Ex7(int orderNumber, String customer, double totalAmount) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    @Override
    public int compareTo(Order_Ex7 o) {
        return Integer.compare(this.orderNumber, o.orderNumber);
    }

    @Override
    public String toString() {
        return "Order_Ex7{" +
                "orderNumber=" + orderNumber +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

public class Ex_7 {
    public static void main(String[] args) {
        TreeMap<Integer, Order_Ex7> orderMap = new TreeMap<>();
        orderMap.put(1, new Order_Ex7(1, "Alex", 100.0));
        orderMap.put(2, new Order_Ex7(2, "Bob", 200.0));
        orderMap.put(3, new Order_Ex7(3, "Charlie", 300.0));

        Order_Ex7 order = orderMap.get(1);
        System.out.println(order);
    }
}
