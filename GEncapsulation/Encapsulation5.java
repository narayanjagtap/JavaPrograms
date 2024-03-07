package JavaPrograms.GEncapsulation;

class Student5{
    private int age;
    private String name;

    public void setData(int age){
        this.age = age;        //these are shadowing problem, it is solve using "this" keyword.
    }
    public void setData(String name){
        this.name = name;       //these are shadowing problem, it is solve using "this" keyword.
    }

    public void show(){
        System.out.println(name + "  " + age);
    }
}
public class Encapsulation5 {
    public static void main(String[] args) {
        Student5 obj1 = new Student5();
        Student5 obj2 = new Student5();

        obj1.setData("Narayan");
        obj1.setData(20);

        obj2.setData("Sagar");
        obj2.setData(17);

        obj1.show();
        obj2.show();
    }
}
//Shadowing Problem and this keyword:-  If both local variable and instance variable have the same name inside the method then it would result in a name-clash and jvm will always give preference for local variable. This approach is called the “Shadowing problem”.