package JavaPrograms.RMapAndGenerics;

class Employee{
    private String EmplName;
    private int EmplID;

    public Employee(String EmplName, int EmplID){
        this.EmplName=EmplName;
        this.EmplID=EmplID;
    }
    public String toString(){   //Your Keys are visible. but values are visible in form of "Hash code" or "Address code".
        return EmplID + " ";    //This problem are solve using the toString() method.
    }
    @Override
    public void finalize(){
        System.out.println("Clean up work by Garbage collector before de allocating Memory from heap");
    }
}
public class MapGenerics12 {
    public static void main(String[] args) {
        
        Employee e = new Employee("Sagar", 71);

        e = null;   //Eligible for Garbage Collection.

        System.gc();    // Invoking Garbage collector.

        System.out.println("Last line...");
    }
}
