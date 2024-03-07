package JavaPrograms.GEncapsulation;

class Student10{
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
public class Encapsulation10 {
    public static void main(String[] args) {
        Student10 obj = new Student10();

        obj.setData(12, "Pruthvirajjjjj Kure");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
