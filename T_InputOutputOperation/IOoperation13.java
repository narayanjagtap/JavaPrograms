package JavaPrograms.T_InputOutputOperation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOoperation13 {
    public static void main(String[] args) throws IOException
    {
        
        File dir = new File("pwJava");
        File file = new File(dir, "pwskill.txt");

        FileReader fd = new FileReader(file);

        char ch[] = new char[(int)file.length()];

        fd.read(ch);

        for(char data:ch){
            System.out.println(data);
        }
    }
}
