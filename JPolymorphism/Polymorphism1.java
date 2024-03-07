package JavaPrograms.JPolymorphism;

class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is Flying");
    }
}
class CargoPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
}
class PassengerPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passingerplane flies at medium height");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();

        Aeroplane ref;

        ref = cp;
        ref.takeOff();
        ref.fly();

        System.out.println("------------------------------------------------");

        ref = pp;
        ref.takeOff();
        ref.fly();

        /* This is a concept of Simple Polymotphism, */
    }
}
