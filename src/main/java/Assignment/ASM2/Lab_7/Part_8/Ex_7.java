package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Animal_Ex7 implements Comparable<Animal_Ex7>{
    String name;
    int age;

    public Animal_Ex7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Animal_Ex7 o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Ex_7 {
    public static void main(String[] args) {
        TreeSet<Animal_Ex7> animals = new TreeSet<>();
        animals.add(new Animal_Ex7("Dog", 18));
        animals.add(new Animal_Ex7("Cat", 20));
        animals.add(new Animal_Ex7("Tiger", 8));

        System.out.println("Animals sorted: ");
        for (Animal_Ex7 animal : animals) {
            System.out.println(animal);
        }
    }
}
