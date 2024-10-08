package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Animal_Ex6 implements Comparable<Animal_Ex6> {
    String name;
    int age;

    public Animal_Ex6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Animal_Ex6 o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Animal_Ex6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Ex_6 {
    public static void main(String[] args) {
        TreeMap<Integer, Animal_Ex6> animals = new TreeMap<>();
        animals.put(1, new Animal_Ex6("Dog", 1));
        animals.put(4, new Animal_Ex6("Cat", 2));
        animals.put(2, new Animal_Ex6("Dog", 3));

        for(Animal_Ex6 animal : animals.values()) {
            System.out.println(animal);
        }
    }
}
