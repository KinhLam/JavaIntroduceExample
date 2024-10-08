package Assignment.ASM2.Lab_7.Part_5;

import java.util.TreeMap;

class Person_Ex3 implements Comparable<Person_Ex3> {
    String name;
    int age;

    public Person_Ex3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person_Ex3 o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person_Ex3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        TreeMap<Person_Ex3, String> treeMap = new TreeMap<>();
        treeMap.put(new Person_Ex3("Kinh", 22), new String("Engineer"));
        treeMap.put(new Person_Ex3("Lam", 21), new String("Student"));
        treeMap.put(new Person_Ex3("Duc", 25), new String("Doctor"));

        treeMap.forEach((personEx3, s) -> System.out.println(personEx3));
    }
}
