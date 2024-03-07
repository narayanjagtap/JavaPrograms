package JavaPrograms.T_InputOutputOperation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

    //Additional method in Deserialization.
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class IOoperation19 {
    public static void main(String[] args) throws Exception
    {

        FileInputStream fis = new FileInputStream("Serialization1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis); //Using BufferInputStream you can reconstruct the object in very efficient way. It is Optional.
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer cr = (Cricketer)ois.readObject(); //Down cast in Cricketor form.

        cr.disp();

        ois.close();
    }
}
//Above program are Perform DeSerialization Operation.