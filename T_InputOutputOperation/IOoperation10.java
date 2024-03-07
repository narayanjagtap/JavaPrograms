package JavaPrograms.T_InputOutputOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOoperation10 {
    public static void main(String[] args) throws IOException
    {
        
        File dir = new File("pwJava");
        File file = new File(dir, "pwskill.txt");
        file.createNewFile();
        
        FileWriter fw = new FileWriter(file, true); //Now bellow data can not be overroded, because you write 'true'.

        fw.write("Narayan");
        fw.write("\n");
        fw.write(65);   //ASCII value of 65 corresponds to the capital letter 'A'.
        fw.write("\n");
        fw.write(97);   //ASCII value of 65 corresponds to the small letter 'a'.
        fw.write("\n");
        char ch[] = {'j', 'a', 'v','a'};
        fw.write(ch);
        fw.write("\n");

        fw.close(); //this method are help to execute data in perticular file.

        System.out.println("Open pw.txt to see result....");
    }
}
//Above data can not be erase in next Program.
//these program are write data in numbers of time.