package Lecture.Buoi_5_JavaCollection.Lab.Ex_3_Abstract_Interfaces;

class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    // Implementation of makeSound for Bird
    @Override
    public void makeSound() {
        System.out.println(getName() + " is chirping.");
    }

    // Implementation of fly method
    @Override
    public void fly() {
        System.out.println(getName() + " is flying in the sky.");
    }
}

// Subclass Fish that extends Animal and implements Swimmable
class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    // Implementation of makeSound for Fish
    @Override
    public void makeSound() {
        System.out.println(getName() + " is bubbling.");
    }

    // Implementation of swim method
    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the water.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create an instance of Bird
        Bird bird = new Bird("Eagle");
        bird.makeSound();
        bird.fly();

        // Create an instance of Fish
        Fish fish = new Fish("Goldfish");
        fish.makeSound();
        fish.swim();
    }
}
