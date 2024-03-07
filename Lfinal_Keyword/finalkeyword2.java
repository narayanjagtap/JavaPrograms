package JavaPrograms.Lfinal_Keyword;

class Animal2{
    final public void sleep(){
        System.out.println("Animal need Good sleep...");
    }
}
class Tiger2 extends Animal2{
    /*
     * final method are participiate in Inheritance,
     * but final method are NOT OVERRIIDED in child class.
     */
}

public class finalkeyword2 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

        Animal2 a = new Animal2();
        a.sleep();
    }
}
