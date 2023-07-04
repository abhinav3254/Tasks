package July4year2023;

public class Q3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,10);
        System.out.println("Area of triangle:- "+triangle.area());
        Rectangle rectangle = new Rectangle(10,10);
        System.out.println("Perimeter of rectangle:- "+rectangle.perimeter());
        System.out.println("Area of rectangle:- "+rectangle.area());
    }
}

class Triangle {
    float height;
    float base;

    Triangle (float height, float base) {
        this.base = base;
        this.height = height;
    }

    public float area () {
        return 0.5f*this.base*this.height;
    }
}

class Rectangle {
    float length;
    float breadth;

    Rectangle (float length, float breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public float area () {
        return this.length*this.breadth;
    }

    public float perimeter () {
        return 2f*(this.length+this.breadth);
    }
}
