import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Shape {
    int length;
    int breadth;
    
    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth ;
    }
    public void area(){
        System.out.print(length + " " + breadth);
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    @Override
    public void area() {
        System.out.print(length*breadth);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Shape shape = new Shape(length, breadth);
        shape.area();

        Shape rectangle = new Rectangle(length, breadth);
        rectangle.area();
    }
}
