package JavaPrograms.GEncapsulation;

class Student4{
    private int age;
    private String name;

    public void setData(int age){
        age = age;       //these are shadowing problem, Solved in next program.
    }
    public void setData(String name){
        name = name;      //these are shadowing problem, Solved in next program.
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }

}
public class Encapsulation4 {
    public static void main(String[] args) {
        Student4 obj1 = new Student4();

        obj1.setData(22);
        obj1.setData("Narayan");

        obj1.show();
    }
}
//Shadowing Problem and this keyword:-  If both local variable and instance variable have the same name inside the method then it would result in a name-clash and jvm will always give preference for local variable. This approach is called the “Shadowing problem”.