package JavaPrograms.NInterfaceAndLambda;

interface Demo{

    int age = 20;// Variables are "public static final".

    void show();// It will allow only abstract methods.(not body)

}
public class Interface1 {
    public static void main(String[] args) {

        System.out.println(Demo.age);
        
    }
}
