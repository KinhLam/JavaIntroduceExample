package Lecture.Buoi_5_JavaCollection.Lab.Ex2_Interfaces;

interface drawable {
    void draw();
}

class Circle implements drawable {
    @Override
    public void draw() {
        System.out.println("Circla");
    }
}

class Rectangle implements drawable {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

public class DrawableTest{
    public static void main(String[] args) {
        drawable d = new Circle();
        d.draw();
        drawable d2 = new Rectangle();
        d2.draw();

    }
}
