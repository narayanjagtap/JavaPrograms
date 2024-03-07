package JavaPrograms.T_InputOutputOperation;

import java.io.*;

public class IOoperation4 {
    public static void main(String[] args) {

        File dir = new File("pw");
        System.out.println(dir.exists());   //false.

        dir.mkdirs();   //we are now create physical directory.
        System.out.println(dir.exists());   //true because you create directory,
    }
}
