package JavaPrograms.JPolymorphism;

class Aeroplane9{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is Flying");
    }
}
class CargoPlane9 extends Aeroplane9{
    public void takeOff(){
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
}
class PassengerPlane9 extends Aeroplane9{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passingerplane flies at medium height");
    }
}
class FighterPlane9 extends Aeroplane9{
    public void takeOff(){
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly(){
        System.out.println("FighterPlane flies at high height");
    }
}
class Airport9{
    public void poly(Aeroplane9 ref){
        ref.takeOff();
        ref.fly();
        System.out.println("------------------------------------------");
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        
        CargoPlane9 cp = new CargoPlane9();
        PassengerPlane9 pp = new PassengerPlane9();
        FighterPlane9 fp = new FighterPlane9();

        Airport9 a = new Airport9();

        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
