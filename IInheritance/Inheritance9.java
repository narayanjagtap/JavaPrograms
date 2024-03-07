package JavaPrograms.IInheritance;

class Aeroplane2{
    public void takeOff(){
        System.out.println("Aeroplane is TakeOff...");
    }
    public void fly(){// Overridden Metod
        System.out.println("Aeroplane is Flying...");
    }
}
class CargoPlane2 extends Aeroplane2{
    public void fly(){// Overriding Metod
        System.out.println("Cargoplane flies at lower height");
    }
    public void CarryGoods(){// SpecializeG Met1od
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane2 extends Aeroplane2{
    public void fly(){// Overriding Metod
        System.out.println("Passingerplane flies at medium height");
    }
    public void CarryPassengersa(){// SpecializeG Met1od
        System.out.println("PassingerPlane carries Passinger");
    }
}
public class Inheritance9 {
    public static void main(String[] args) {
        CargoPlane2 cp = new CargoPlane2();
        cp.takeOff();
        cp.fly();
        cp.CarryGoods();

        System.out.println("-----------------------------------------------------");

        PassengerPlane2 pp = new PassengerPlane2();
        pp.takeOff();
        pp.fly();
        pp.CarryPassengersa();
    }
}
