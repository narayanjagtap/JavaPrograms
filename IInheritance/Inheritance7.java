package JavaPrograms.IInheritance;

class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is Take-off...");
    }
    public void fly(){
        System.out.println("Aeroplane is flying...");
    }
}
class CargoPlane extends Aeroplane{

}
class PassengerPlane extends Aeroplane{

}

public class Inheritance7 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }
}
