package JavaPrograms.NInterfaceAndLambda;
class A{
    public void show(){
        System.out.println("In show...");
    }
    class B{  // B is member inner class
        public void disp(){
            System.out.println("In disp...");
        }
    }
}
public class Interface6 {
    public static void main(String[] args) {

        A obj = new A();
        A.B obj1 = obj.new B(); // for member inner class

        obj.show();
        obj1.disp();
    }
}
