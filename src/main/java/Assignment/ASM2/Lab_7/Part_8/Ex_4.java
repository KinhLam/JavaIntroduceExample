package Assignment.ASM2.Lab_7.Part_8;

import java.util.Objects;
import java.util.TreeSet;

class Customer_Ex4{
    int id;
    String name, email;

    public Customer_Ex4(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer_Ex4 that = (Customer_Ex4) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return "Customer_Ex4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Ex_4 {
    public static void main(String[] args) {
        TreeSet<Customer_Ex4> customers = new TreeSet<>((c1, c2) -> c1.email.compareTo(c2.email));
        customers.add(new Customer_Ex4(1, "John", "john.example.com"));
        customers.add(new Customer_Ex4(2, "Jane", "jane.example.com"));
        customers.add(new Customer_Ex4(3, "Jack", "jack.example.com"));

        Customer_Ex4 cus = new Customer_Ex4(4, "Jane", "jane.example.com");
        if(customers.contains(cus)){
            System.out.println(cus.email + " exits");
        }else{
            System.out.println(cus.email + " does not exist");
        }
    }
}
