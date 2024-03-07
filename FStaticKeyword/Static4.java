package JavaPrograms.FStaticKeyword;

import java.util.Scanner;

import javax.swing.SpringLayout;

class Farmer{
    int pa;        //principle amount
    float td;       //time duration
    float ri;        //rate of intress
    float si;       //simple intress


    void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please mention the amount required");
        pa=scan.nextInt();
        System.out.println("Please mention time duration");
        td=scan.nextFloat();
        ri=8.5f;
    }
    void compute()
    {
        si=(pa*ri*td)/100f;           //formula for simple intress in float.
    }
    void disp()
    {
        System.out.println("Simple intress is:"+si);
    }
}


public class Static4 {
    public static void main(String[] args) {
        Farmer obj1=new Farmer();
        obj1.input();
        obj1.compute();
        obj1.disp();
        Farmer obj2=new Farmer();
        obj2.input();
        obj2.compute();
        obj2.disp();
    }
}