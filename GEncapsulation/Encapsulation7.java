package JavaPrograms.GEncapsulation;

class Student7{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name + "   " + age);
    }
}
public class Encapsulation7 {
    public static void main(String[] args) {
        Student7 obj1 = new Student7();
        Student7 obj2 = new Student7();

        obj1.setAge(35);
        obj1.setName("Pratap Mama");

        obj2.setAge(45);
        obj2.setName("Dada");

        int studAge = obj1.getAge();
        System.out.println(studAge);
        String studName = obj1.getName();
        System.out.println(studName);

        int studAge1 = obj2.getAge();
        System.out.println(studAge1);
        String studName1 = obj2.getName();
        System.out.println(studName1);
    }
}
