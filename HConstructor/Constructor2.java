package JavaPrograms.HConstructor;

class Demo{
    private int age;
    private String name;

    //If we don't write any constructor, then the compiler will generate a default constructor.

    public void Disp(){
        System.out.println(age);
        System.out.println(name);
    }
}
public class Constructor2 {
    public static void main(String[] args) {

        Demo obj = new Demo();  //this is call to default constructor, becouse these are not show any parameror.

        obj.Disp();
    }
}
