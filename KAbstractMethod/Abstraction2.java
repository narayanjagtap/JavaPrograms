package JavaPrograms.KAbstractMethod;

abstract class AeroPlane1{  /*Abstract class */
    abstract public void takeOff();// Abstract method
    abstract public void fly();// Abstract method
    public void landing(){// Non-Abstract method
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane1 extends AeroPlane1{
    public void takeOff(){
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
    public void alert(){// Specialized Method..
        System.out.println("Alert....");
    }
}
class PassengerPlane1 extends AeroPlane1{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passingerplane flies at medium height");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------");

        AeroPlane1 c = new CargoPlane1();
        c.takeOff();// Overridden method Call
        c.fly();// Overridden method Call
        c.landing();// Inherited method Call
        ((CargoPlane1)c).alert(); // using Down Casting concept Specialized Method Call

        System.out.println("------------------------------------------------------");

        AeroPlane1 p = new PassengerPlane1();
        p.takeOff();// Overridden method Call
        p.fly();// Overridden method Call
        p.landing();// Inherited method Call

        System.out.println("--------------------------------------------------------");
        
        /* This is a concept of Abstraction */
    }
}
