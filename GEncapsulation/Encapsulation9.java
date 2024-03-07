package JavaPrograms.GEncapsulation;

class Student9{
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
public class Encapsulation9 {
    public static void main(String[] args) {
        Student9 obj = new Student9();
        
        obj.setName("Sagar");
        obj.setAge(16);

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
