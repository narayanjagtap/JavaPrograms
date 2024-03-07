package JavaPrograms.MRevisisonOnOops;

import java.util.Scanner;

abstract class shape{
    float area;

    abstract public void input();
    abstract public void compute();
    public void disp(){
        System.out.println("Area is :  " + area);
    }
}
class Rectangle1 extends shape{
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
        area = length*breadth;
    }
}
class Square1 extends shape{
    float length;

    public void input(){
        System.out.println("Calculation of Square app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Square : ");
        length = scan.nextFloat();
    }
    public void compute(){
        area = length*length;
    }
}
class circle1 extends shape{
    float redious;

    public void input(){
        System.out.println("Calculation of Circle app: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter radius of Circle: ");
        redious = scan.nextFloat();
    }
    public void compute(){
        area = 3.14f * redious *redious;
    }
}

public class RevisionOnOops2 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------");

        Rectangle1 r = new Rectangle1();
        r.input();
        r.compute();
        r.disp();

        System.out.println("---------------------------------------------");

        Square1 s = new Square1();
        s.input();
        s.compute();
        s.disp();

        System.out.println("---------------------------------------------");

        circle1 c = new circle1();
        c.input();
        c.compute();
        c.disp();

        System.out.println("-----------------------------------------------");
    }
}
