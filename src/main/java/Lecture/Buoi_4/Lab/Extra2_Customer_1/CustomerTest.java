package Lecture.Buoi_4.Lab.Extra2_Customer_1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Kinh", "Dĩ An, BD", "lamduckinh@gmail.com");
        Customer[] array = new Customer[10];

        array[0] = customer;

        for(int i = 0; i < array.length; i++){
            array[i] = customer;
        }

        for(Customer c : array){
            System.out.println(c.getName());
        }

        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Email: " + customer.getEmail());


        customer.setEmail("lamduckinh2k2@gmail.com");
        System.out.println("Email: " + customer.getEmail());


    }
}
