package JavaPrograms.FStaticKeyword;
class Demo1{
    static int a ;
    static int b ;

    int m;
    int n;

    static{
        a=10;
        b=20;
    }

    {
        m=30;
        n=40;
    }

    static void disp1(){
        System.out.println("Static variable 'a' is " + a);
        System.out.println("Static variable 'b' is " + b);
    }

    void disp2(){
        System.out.println("NonStatic Variable 'm' is " + m);
        System.out.println("NonStatic variable 'n' is " + n);
    }
}
public class Static3 {
    public static void main(String[] args) {
        Demo1.disp1();         // coll for static method.

        Demo1 d = new Demo1();
        d.disp2();           // coll for non static method.
    }
}
