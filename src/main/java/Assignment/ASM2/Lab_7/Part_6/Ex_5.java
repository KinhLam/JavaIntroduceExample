package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Customer_Ex5 implements Comparable<Customer_Ex5> {
    int id;
    String name;
    String email;

    public Customer_Ex5(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer_Ex5 o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Customer_Ex5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Ex_5 {
    public static void main(String[] args) {
        TreeMap<Integer, Customer_Ex5> customerMap = new TreeMap<>();
        customerMap.put(1, new Customer_Ex5(1, "John", "john.example.com"));
        customerMap.put(2, new Customer_Ex5(2, "Jane", "jane.example.com"));
        customerMap.put(3, new Customer_Ex5(3, "Joe", "joe.example.com"));

        Customer_Ex5 cus = customerMap.get(1);
        System.out.println(cus);
    }
}
