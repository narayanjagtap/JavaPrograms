package JavaPrograms.GEncapsulation;

class Student8{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
public class Encapsulation8 {
    public static void main(String[] args) {
        Student8 obj = new Student8();

        obj.setAge(17);
        obj.setName("Sagar Jagtap");

        int studAge = obj.getAge();
        System.out.println(studAge);
        String studName = obj.getName();
        System.out.println(studName);
    }
}
