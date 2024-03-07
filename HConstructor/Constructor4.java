package JavaPrograms.HConstructor;

class Demo4 {
    private int age;
    private String name;

    // Default constructor (no parameters)
    public Demo4() {
        
    }

    // Parameterized constructor
    public Demo4(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void disp() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class Constructor4 {
    public static void main(String[] args) {
        Demo4 obj = new Demo4();
        obj.disp();

        Demo4 d = new Demo4(121, "Deva");
        d.disp();
    }
}

