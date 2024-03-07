package JavaPrograms.Lfinal_Keyword;

class Animal3{

    final int age = 40;

    public void sleep(){
        System.out.println("Animal need Good sleep...");
    }
}
class Tiger3 extends Animal3{
    age = 20;
     /*we can decalare a variable also "final" then variable behieve as a CONSTANT VALUE or NON-CHANGEABLE VALUE*/
}
public class finalkeyword3 {
    public static void main(String[] args) {
        Tiger3 t = new Tiger3();
        t.sleep();

        System.out.println("Age is : " + t.age);
    }
}
