package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Animal_Ex6{
    String name;
    int age;

    public Animal_Ex6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal_Ex6 animalEx6 = (Animal_Ex6) o;
        return Objects.equals(name, animalEx6.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
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
        HashMap<String, Animal_Ex6> animalMap = new HashMap<>();
        animalMap.put("Lion", new Animal_Ex6("Lion", 8));
        animalMap.put("Elephant", new Animal_Ex6("Elephant", 25));
        animalMap.put("Tiger", new Animal_Ex6("Tiger", 10));

        Animal_Ex6 animal = animalMap.get("Elephant");
        System.out.println(animal);
    }
}
