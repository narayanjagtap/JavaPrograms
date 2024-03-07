package JavaPrograms.COopsFandamental;

public class ObjectCreation3 {
    int age = 20;
    String name = "Pratap Kure";
    public static void main(String[] args) {
        ObjectCreation3 obj1 = new ObjectCreation3();
        ObjectCreation3 obj2 = new ObjectCreation3();

        obj1.name = "Narayan Jagtap";
        obj2.age = 40;

        System.out.println("Name of the obj1 is: " + obj1.name);
        System.out.println("Age of the obj1 is: " + obj1.age);

        System.out.println("Name of the obj2 is: " + obj2.name);
        System.out.println("Age of the obj2 is: " + obj2.age);
    }
}
