package JavaPrograms.T_InputOutputOperation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer2 implements Serializable //Implements Serializable Interface. It is a Marker Interface.
{
     String name;
    transient int age;  //now age are not participiat in Serialization because you use transient keyword.
     int runs;

    //Constructor
    public Cricketer2(String name, int age, int runs){
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}

public class IOoperation20 {
    public static void main(String[] args) throws Exception
    {
        Cricketer2 c = new Cricketer2("Rohit", 35, 25000);

        FileOutputStream fos = new FileOutputStream("Serialization2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);   //Using BufferOutputStream you can store object very efficient way.
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(c);

        oos.close();
    }
}
// using "transient" keyword you can achive selective Serialization.