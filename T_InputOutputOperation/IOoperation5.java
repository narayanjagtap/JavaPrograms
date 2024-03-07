package JavaPrograms.T_InputOutputOperation;

import java.io.*;

public class IOoperation5 {
    public static void main(String[] args) throws IOException
    {
        File dir = new File("pwJava");
        System.out.println(dir.isDirectory());  //these method are chack only directory exist or not.
        dir.mkdir();    //we are now create physical directory.
        System.out.println(dir.isDirectory());

        File file = new File(dir, "pwskill.txt");   //these method are chack file(pwskill) in 'pwJava' directory.
        file.createNewFile();
        System.out.println(file.isFile());
    }
}
