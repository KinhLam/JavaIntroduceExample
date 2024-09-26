/*Create a class called CSVReader with a method called readCSV(String fileName) that reads data
from a CSV file and returns it as a List of objects. Implement another method called
writeCSV(String fileName, List<Object> data) that writes the given data as CSV to the specified
file. The objects in the list should have appropriate attributes to represent the data in each row of the
CSV. Test the CSVReader class by creating an instance, calling the readCSV method to read data
        from a CSV file, and calling the writeCSV method to write data to a CSV file.*/


package Lab.Java_IO.Ex_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class CSVReader {

    //Đọc file
    public List<Person> readCSV(String fileName) {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                Person person = Person.fromCSV(line);
                persons.add(person);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return persons;
    }

    //Viết vào trong file
    public void writeCSV(String fileName, List<Person> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Person person : data) {
                bw.write(person.toString());
                bw.newLine();
            }
            System.out.println("Data has been written to the CSV file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Doe", 30, "john@example.com"));
        persons.add(new Person("Jane Smith", 25, "jane@example.com"));
        persons.add(new Person("Alice Brown", 35, "alice@example.com"));

        csvReader.writeCSV("src/main/java/Lab/Java_IO/Ex_2/persons.csv", persons);

        List<Person> readPersons = csvReader.readCSV("src/main/java/Lab/Java_IO/Ex_2/persons.csv");
        System.out.println("Data read from the CSV file:");
        for (Person p : readPersons) {
            System.out.println(p.getName() + " | " + p.getAge() + " | " + p.getEmail());
        }
    }
}
