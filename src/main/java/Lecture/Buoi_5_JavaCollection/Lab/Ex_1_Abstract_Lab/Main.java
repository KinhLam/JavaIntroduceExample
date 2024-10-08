package Lecture.Buoi_5_JavaCollection.Lab.Ex_1_Abstract_Lab;

abstract class Animal{
    protected String name;

    //contructor
    public Animal(String name){
        this.name = name;
    }

    //Getname
    public String getName(){
        return name;
    }

    public abstract void eat();
    public abstract void sleep();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sleep(){
        System.out.println("Dog sleep");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Husky");
        dog.eat();
        dog.sleep();
        Animal cat = new Cat("Mike");
        cat.eat();
        cat.sleep();

    }
}
