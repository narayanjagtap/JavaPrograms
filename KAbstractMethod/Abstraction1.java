package JavaPrograms.KAbstractMethod;

abstract class Aeroplane  /*Abstract class */
{
    abstract public void takeOff();// Abstract method
    abstract public void fly();// Abstract method
}

class Cargoplane extends Aeroplane{
    public void takeOff(){
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
}
class Passingerplane extends Aeroplane{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passingerplane flies at medium height");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {

        Aeroplane c = new Cargoplane();
        c.takeOff();
        c.fly();

        Aeroplane p = new Passingerplane();
        p.takeOff();
        p.fly();

        /* This is a concept of Abstraction */
    }
}
