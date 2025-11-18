package w11;

public class Circle implements Shape {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    };

    public double perimeter() {
        return 2 * PI * radius;
    };

  /*   public double volume() {
        return radius * 4;
    }*/
    
}
