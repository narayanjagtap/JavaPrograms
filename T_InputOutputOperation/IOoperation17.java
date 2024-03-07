package JavaPrograms.T_InputOutputOperation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable //Implements Serializable Interface. It is a Marker Interface.
{
    private String name;
    private int age;
    private int runs;

    //Constructor
    public Cricketer(String name, int age, int runs){
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}

public class IOoperation17 {
    public static void main(String[] args) throws Exception
    {
        Cricketer c = new Cricketer("Rohit", 35, 25000);

        FileOutputStream fos = new FileOutputStream("Serialization1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);

        oos.close();
    }
}
//Above program are Perform Serialization Operation.
//Output is Show in 'Serialization.txt' file.