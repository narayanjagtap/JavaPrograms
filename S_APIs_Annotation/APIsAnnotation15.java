package JavaPrograms.S_APIs_Annotation;

//Parent class
class Plane{
    public void PlaneAtGoodHight(){
        System.out.println("Plane is Flying...");
    }
}

//child class
class Cargoplane extends Plane{

    //Overriden method from Parent class.
    public void PlaneAtGdHight(){   //These program are not show error in Method Name.
        System.out.println("Cargoplane flies Low...");
    }
}

public class APIsAnnotation15 {
    public static void main(String[] args) {
        //Object of Child class.
        Plane cp = new Cargoplane();
        cp.PlaneAtGoodHight();
    }
}

//But Method are NOT compleatly Override.
//These Problem are solve by Annotation in Next Program.