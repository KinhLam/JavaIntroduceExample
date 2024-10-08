package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Customer_Ex5{
    int id;
    String name;
    String email;

    public Customer_Ex5(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer_Ex5 that = (Customer_Ex5) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
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
        HashMap<String, Customer_Ex5> customerMap = new HashMap<>();
        customerMap.put("kinh@gmail.com", new Customer_Ex5(1, "Kinh", "kinh@gmail.com"));
        customerMap.put("lam@gmail.com", new Customer_Ex5(2, "Lam", "lam@gmail.com"));

        Customer_Ex5 customer = customerMap.get("kinh@gmail.com");
        System.out.println(customer);
    }
}
