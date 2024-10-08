package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.Objects;

class Customer_Ex6{
    int id;
    String name;
    String email;

    public Customer_Ex6(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer_Ex6 that = (Customer_Ex6) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return "Customer_Ex6{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Ex_6 {
    public static void main(String[] args) {
        HashSet<Customer_Ex6> customers = new HashSet<>();
        customers.add(new Customer_Ex6(1, "KinhLam", "lamduckinh@gmail.com"));
        customers.add(new Customer_Ex6(2, "Haha", "hahaha@gmail.com"));

        Customer_Ex6 search = new Customer_Ex6(3, "Hehe", "hahaha@gmail.com");
        System.out.println("Contains email: " + customers.contains(search));
    }
}
