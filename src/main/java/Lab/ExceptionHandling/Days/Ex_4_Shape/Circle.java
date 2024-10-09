package Lab.ExceptionHandling.Days.Ex_4_Shape;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        if(radius < 0){
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }


}
