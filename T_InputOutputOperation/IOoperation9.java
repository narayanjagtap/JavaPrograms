package JavaPrograms.T_InputOutputOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOoperation9 {
    public static void main(String[] args) throws IOException
    {
        
        File dir = new File("pw");
        File file = new File(dir, "pw.txt");
        file.createNewFile();
        
        FileWriter fw = new FileWriter(file);

        fw.write("Narayan");
        fw.write("\n");
        fw.write(65);   //ASCII value of 65 corresponds to the capital letter 'A'.
        fw.write("\n");
        fw.write(97);   //ASCII value of 65 corresponds to the small letter 'a'.
        fw.write("\n");
        char ch[] = {'j', 'a', 'v','a'};
        fw.write(ch);
        fw.write("\n");

        fw.close();

        System.out.println("Open pw.txt to see result....");
    }
}
//Above program are write data in overroded form,
//and this overroded data can be erase in next Program.