package JavaPrograms.HConstructor;

class Student{
    private int age;
    private String name;

    public void setData(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
//This Program based on encapsulation.
public class Constructor1 {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setData(45, "Dada");

        int studAge = obj.getAge();
        System.out.println(studAge);

        String studName = obj.getName();
        System.out.println(studName);

    }
}
