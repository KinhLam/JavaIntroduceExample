package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.TreeSet;

class Animal_Ex8 implements Comparable<Animal_Ex8> {
    String name;
    int age;

    public Animal_Ex8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Animal_Ex8 o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Animal_Ex8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Ex_8 {
    public static void main(String[] args) {
        HashSet<Animal_Ex8> animals = new HashSet<>();
        animals.add(new Animal_Ex8("Dog", 8));
        animals.add(new Animal_Ex8("Cat", 2));
        animals.add(new Animal_Ex8("Turtle", 100));

        TreeSet<Animal_Ex8> sortedAnimals = new TreeSet<>(animals);
        sortedAnimals.forEach(System.out::println);
    }
}
