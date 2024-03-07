package JavaPrograms.T_InputOutputOperation;

import java.io.*;

public class IOoperation3 {
    public static void main(String[] args) throws IOException
    {
        
        File file1 = new File("pw.txt");
        System.out.println(file1.exists()); //false

        file1.createNewFile();  //we are now create physical file.
        System.out.println(file1.exists()); //true because you create file,
    }
}
