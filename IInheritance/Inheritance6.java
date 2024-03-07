package JavaPrograms.IInheritance;

//multiple inheritance

class Parent1{
    int age = 20;
}
class Paremt2{
    int age = 18;
}

class Child extends Parent1 , Parent2{
    /* show error becouse multiple inheritance is not allowed in JAVA, 
    This Problem is solve by using the concept of INTERFACE, 
    AANI HA CONCEPT AAPAN PUDHE SHIKANAR AAHOT */
}

public class Inheritance6 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.age);
    }
}
