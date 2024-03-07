package JavaPrograms.T_InputOutputOperation;

import java.io.File;

public class IOoperation7 {
    public static void main(String[] args) {
        
        int count = 0;

        File f = new File("D:\\Photo");

        String str[] = f.list();

        for(String name : str){
            count++;
            System.out.println(name);
        }

        System.out.println("--------------------------------------------------------------");

        System.out.println("Numbers of Files are exist in Perticular Directory : " + count);
        
        System.out.println("--------------------------------------------------------------");
    }
}
//This program are chack how many files exists in perticular Directory.