package JavaPrograms.MRevisisonOnOops;

import java.util.Scanner;

class Rectangle{
    float length;
    float breadth;
    float area;

    public void input(){
        System.out.println("Calculation of Rectangle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of rectangle: ");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of Rectangle:");
        breadth = scan.nextFloat();
    }
    public void compute(){
        area = length * breadth;
    }
    public void disp(){
        System.out.println("The area of Rctangle is: " + area);
    }
}
class square{
    float length;
    float area;

    public void input(){
        System.out.println("Calculation of Square app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Square: ");
        length = scan.nextFloat();
    }
    public void compute(){
        area = length*length;
    }
    public void disp(){
        System.out.println("The area of Square is: " + area);
    }
}
class circle{
    float redious;
    float area;

    public void input(){
        System.out.println("Calculation of Circle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter radius of Circle: ");
        redious = scan.nextFloat();
    }
    public void compute(){
        area = 3.14f * redious * redious;
    }
    public void disp(){
        System.out.println("The area of Circle is: " + area);
    }
}
public class RevisionOnOops1 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------");

        Rectangle re = new Rectangle();
        re.input();
        re.compute();
        re.disp();

        System.out.println("----------------------------------------------------------");

        square s = new square();
        s.input();
        s.compute();
        s.disp();

        System.out.println("----------------------------------------------------------");

        circle c = new circle();
        c.input();
        c.compute();
        c.disp();

        System.out.println("----------------------------------------------------------");
    }
}
// 'This Program are based on BASIC JAVA'