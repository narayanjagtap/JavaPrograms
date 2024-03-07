package JavaPrograms.IInheritance;

class Man{
    int a, b;

    Man(){
        System.out.println("Parent class constructor...");
    }
    Man(int x, int y){
        System.out.println("Parameterised Parent class Constructor...");
        a = x;
        b = y;
    }
}
class Man1 extends Man{
    int m, n;

    Man1(){
        /* behind the seen at that position automatically 'super()' method are call */
        // super();
        System.out.println("Child class constructor...");
    }
    Man1(int x , int y){
        System.out.println("Parameterised child class constructor...");
        n = x;
        m = y;
    }
}

public class Inheritance10 {
    public static void main(String[] args) {
        Man1 d1 = new Man1();
    }
}