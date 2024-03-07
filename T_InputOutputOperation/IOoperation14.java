package JavaPrograms.T_InputOutputOperation;

import java.io.*;

public class IOoperation14 {
    public static void main(String[] args) throws Exception
    {
        
        File dir = new File("pw");
        File file = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);    //65 print the ASCII value of 65.
        bw.newLine();
        char ch[] = {'P', 'W', 'J', 'a', 'v', 'a'};
        bw.write(ch);
        bw.newLine();

        bw.close();
    }
}
