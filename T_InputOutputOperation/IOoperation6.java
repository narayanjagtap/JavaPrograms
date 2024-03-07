package JavaPrograms.T_InputOutputOperation;

import java.io.File;

public class IOoperation6 {
    public static void main(String[] args) {
        
        int count = 0;

        File f = new File("pwJava");

        String str[] = f.list();    //now all files are stored in str Array.

        for(String name : str){
            count++;
            System.out.println(name);
        }

        System.out.println("Numbers of Files are : " + count);

    }
}
//This program are chack how many files exists in perticular Directory.