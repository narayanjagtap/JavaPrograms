package JavaPrograms.IInheritance;

// Hierartical inheritance

class Tiger1{
    void name(){
        System.out.println("Narayan Pandurang Jagtap");
    }
}
class Monkey extends Tiger1{

}
class Deer extends Tiger1{

}

public class Inheritance5 {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.name();

        Monkey m = new Monkey();
        m.name();
    }
}
