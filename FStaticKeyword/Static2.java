package JavaPrograms.FStaticKeyword;

class Demo {
    static void disp1(){
        System.out.println("Static disp1()");
    }
    void disp2(){
        System.out.println("Non Static disp2()");
    }
}
public class Static2 {
    public static void main(String[] args) {
        Demo.disp1();             //becouse these are static method.

        Demo d = new Demo();
        d.disp2();                //object is created becouse these are non static method.
        d.disp1();               //objec banakar bhi aap static method ko call kar skate ho.
    }
}
