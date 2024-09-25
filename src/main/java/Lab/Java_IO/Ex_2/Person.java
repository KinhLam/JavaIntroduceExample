package Lab.Java_IO.Ex_2;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and toString method for displaying the data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + email;
    }

    // Method to create a Person object from a CSV line
    public static Person fromCSV(String csvLine) {
        String[] attributes = csvLine.split(",");
        return new Person(attributes[0], Integer.parseInt(attributes[1]), attributes[2]);
    }
}
