package Lecture.Buoi_5_JavaCollection.Lab.More_3.Ex_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Khai báo mảng ArrayList Employee
        ArrayList<Employee> employee  = new ArrayList<>();

        //Thêm
        employee.add(new Employee(1, "Kính", 3000));
        employee.add(new Employee(2, "Khoa", 2500));
        employee.add(new Employee(3, "Duy", 2200));

        for(Employee em : employee) {
            System.out.println(em);
        }

        //Xóa
        employee.remove(1); //Cách 1

        //Tìm kiếm
        for(Employee em : employee) {
            if(em.getId() == 2){
                System.out.println(em);
                break;
            }
        }

        //Sắp xếp
        Collections.sort(employee, Comparator.comparing(emp -> emp.getSalary()) );

        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employee) {
            emp.display();
        }

    }
}
