package JavaPrograms.MRevisisonOnOops;

import java.util.Scanner;

abstract class shape2{
    float area;

    abstract public void input();
    abstract public void compute();
    public void disp(){
        System.out.println("Area is : " + area);
    }
}
class Rectangle2 extends shape2{
    float length;
    float breadth;

    public void input(){
        System.out.println("Calculation of Rectangle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of rectangle:");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of Rectangle:");
        breadth = scan.nextFloat();
    }
    public void compute(){
        area = length * breadth;
    }
}
class Square2 extends shape2{
    float length;

    public void input(){
        System.out.println("Calculation of Square app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Square");
        length = scan.nextFloat();
    }
    public void compute(){
        area = length*length;
    }
}
class Circle2 extends shape2{
    float redious;

    public void input(){
        System.out.println("Calculation of Circle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter radius of Circle:");
        redious = scan.nextFloat();
    }
    public void compute(){
        area = 3.14f * redious * redious;
    }
}
class Geometry{
    public void poly(shape2 ref){
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class RevisionOnOops3 {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2();
        Square2 s = new Square2();
        Circle2 c = new Circle2();

        Geometry g = new Geometry();
        g.poly(r);
        g.poly(s);
        g.poly(c);
    }
}