package JavaPrograms.IInheritance;

class Aeroplane1{
    public void Takeoff(){
        System.out.println("Aeroplane is Take Off...");
    }
    public void fly(){  // Overridden Metod
        System.out.println("Aeroplane is Flying...");
    }
}
class CargoPlane1 extends Aeroplane1{
    public void fly(){  // Overriding Metod
        System.out.println("Cargoplane flies at lower height");
    }
}
class PassengerPlane1 extends Aeroplane1{
    public void fly(){  // Overriding Metod
        System.out.println("Passingerplane flies at medium height");
    }
}
public class Inheritance8 {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
        cp.Takeoff();
        cp.fly();

        PassengerPlane1 pp = new PassengerPlane1();
        pp.Takeoff();
        pp.fly();
    }
}
