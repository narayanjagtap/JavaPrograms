package JavaPrograms.T_InputOutputOperation;

import java.io.*;

public class IOoperation11 {
    public static void main(String[] args) throws IOException
    {
        
        File dir = new File("pwJava");
        File file = new File(dir,"pwskill.txt");

        FileReader fd = new FileReader(file);

        int i = fd.read();

        while(i != -1)  //-1 indicate the end of file.
        {
            System.out.println((char)i);    //Type cast in charactor.
            i=fd.read();
        }
    }
}
