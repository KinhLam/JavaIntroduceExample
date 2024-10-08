package Lecture.Buoi_5_JavaCollection.Lab.Ex_3_Abstract_Interfaces;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}
