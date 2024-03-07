package JavaPrograms.S_APIs_Annotation;

class Plane1{
    public void PlaneAtGoodHight(){
        System.out.println("Plane is Flying...");
    }
}

class Cargoplane1 extends Plane1{

    //Annotation
    @Override   //Built.in Annotation
    public void PlaneAtGoodHight() //Now this Program are show error if you are write Wrong Method Name.
    {
        System.out.println("CargoPlane flies at Low Hight...");
    }
}

public class APIsAnnotation16 {
    public static void main(String[] args) {
        Plane1 cp = new Cargoplane1();
        cp.PlaneAtGoodHight();
    }
}
