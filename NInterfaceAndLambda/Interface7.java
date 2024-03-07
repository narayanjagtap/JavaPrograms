package JavaPrograms.NInterfaceAndLambda;
class A1{
    public void show(){
        System.out.println("In show...");
    }
    static class B1{  // static inner class
        public void disp(){
            System.out.println("In disp...");
        }
    }
}
public class Interface7 {
    public static void main(String[] args) {
        A1 obj = new A1();
        A1.B1 obj1 = new A1.B1(); //for static inner class...

        obj.show();
        obj1.disp();
    }
}
