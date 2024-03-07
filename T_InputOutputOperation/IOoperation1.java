package JavaPrograms.T_InputOutputOperation;

class Student{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city ){
        this.name=name;
        this.age=age;
        this.city=city;
    }
}

public class IOoperation1 {
    public static void main(String[] args) {
        Student st1 = new Student("Narayan", 20, "Latur");
        System.out.println(st1);

        Student st2 = new Student("Sagar", 17, "Latur");
        System.out.println(st2);
    }
}

//compiler output are show only Address code / Hash code of Program. ex: JavaPrograms.T_InputOutputOperation.Student@5acf9800
//These are not show Data of perticular Program. ex: name, age city etc.
//These problem are solve in next program using 'toString() method overried'.