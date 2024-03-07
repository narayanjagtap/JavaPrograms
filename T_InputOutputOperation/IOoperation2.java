package JavaPrograms.T_InputOutputOperation;

class Student1{
    private String name;
    private int age;
    private String city;

    public Student1(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    //toSting() method used for solving Privious Problem.
    public String toString(){
        return "Name : " + name + "  |  Age : " + age + "  |  City: " + city;
    }
}

public class IOoperation2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Narayan", 20, "Pune");
        System.out.println(st1);

        Student1 st2 = new Student1("Sagar", 17, "Latur");
        System.out.println(st2);
    }
}
