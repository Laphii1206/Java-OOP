package w11;

public interface Shape {
    double PI = 3.14159;

    public double area();

    public double perimeter();

    public default double volume() {

        return 0;
    }
    public static void display(){
        System.out.println("Hello");
    }}