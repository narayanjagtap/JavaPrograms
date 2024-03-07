package JavaPrograms.IInheritance;

//multilevel inheritance

class Demo1{
    void name(){
        System.out.println("Narayan Pandurang Jagtap");
    }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo2{

}

public class Inheritance4 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.name();
    }
}
