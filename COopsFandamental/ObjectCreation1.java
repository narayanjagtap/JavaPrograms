package JavaPrograms.COopsFandamental;

public class ObjectCreation1 {
    int a; // Instance variable
    String name; // Instance variable
    public static void main(String[] args) {

        ObjectCreation1 obj = new ObjectCreation1();
        int num = 30; // local  variable
        String name = "Dada"; // local  variable

        System.out.println(obj.a);
        System.out.println(obj.name);

        System.out.println(num);
        System.out.println(name);
    }
}
