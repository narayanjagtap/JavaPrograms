package JavaPrograms.JPolymorphism;

class Aeroplane1{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is Flying");
    }
}
class CargoPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
}
class PassengerPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passingerplane flies at medium height");
    }
}
class FighterPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly(){
        System.out.println("FighterPlane flies at high height");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        
        CargoPlane1 cp = new CargoPlane1();
        PassengerPlane1 pp = new PassengerPlane1();
        FighterPlane1 fp = new FighterPlane1();

        cp.takeOff();
        cp.fly();

        pp.takeOff();
        pp.fly();

        fp.takeOff();
        fp.fly();

        /* This is a concept of Inheritance, */
    }
}
