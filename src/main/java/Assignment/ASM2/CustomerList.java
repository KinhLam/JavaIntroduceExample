package Assignment.ASM2;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    List<Customer> customers;

    public CustomerList() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void removeCustomer(Customer c) {
        customers.remove(c);
    }

    public Customer getCustomerByEmail(String email) {
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
