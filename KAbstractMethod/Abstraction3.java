package JavaPrograms.KAbstractMethod;

abstract class AeroPlane3{
    abstract public void takeOff();
    abstract public void fly();
    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane3 extends AeroPlane3{
    public void takeOff(){
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
    public void Alert(){
        System.out.println("Alert...");
    }
}
class PassengerPlane3 extends AeroPlane3{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passingerplane flies at medium height");
    }
}

public class Abstraction3 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");
        
        CargoPlane3 c = new CargoPlane3();
        c.takeOff();
        c.fly();
        c.landing();
        c.Alert();

        System.out.println("-------------------------------------------------------");

        PassengerPlane3 p = new PassengerPlane3();
        p.takeOff();
        p.fly();
        p.landing();

        System.out.println("-----------------------------------------------------------");

        /* This is a concept of Abstraction */
    }
}
