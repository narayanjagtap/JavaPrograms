package JavaPrograms.IInheritance;

class Demo11{
    int a, b;

    Demo11(){
        System.out.println("Parent class constructor...");
    }
    Demo11(int x, int y){
        System.out.println("Parameterised parent class constructor...");
        x = a;
        y = b;
    }
}
class Demo12 extends Demo11{
    int m, n;

    Demo12(){
        System.out.println("Child class constructor...");
    }
    Demo12(int x, int y){
        /* behind the seen at that position automatically 'super()' method are call */
        // super();
        System.out.println("Parameterised child class constructor...");
        x = m;
        y = n;
    }
}
public class Inheritance11 {
    public static void main(String[] args) {
        Demo12 d1 = new Demo12(12, 45);
    }
}
