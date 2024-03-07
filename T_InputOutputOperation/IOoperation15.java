package JavaPrograms.T_InputOutputOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOoperation15 {
    public static void main(String[] args) throws Exception
    {
        File dir = new File("pw");
        File file =  new File(dir, "pw.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
//In this way we are Read Data line by line.