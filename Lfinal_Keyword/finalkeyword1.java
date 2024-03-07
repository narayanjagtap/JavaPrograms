package JavaPrograms.Lfinal_Keyword;

final class Animal{  // final class
    void sleep(){
        System.out.println("Animal needs good sleep...");
    }
}

class Tiger extends Animal{    // show compiletime error,

}

public class finalkeyword1 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
// show compiletime error, becouse "final" class will not participiate in Inheritance.