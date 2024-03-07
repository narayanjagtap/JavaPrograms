package JavaPrograms.DArray;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Numbers of Elements in Array :  ");
        int n = sc.nextInt();
        String Names[] = new String[n];

        System.out.println("Enter the Elements in Array : ");
        for(int i=0; i<n; i++){
            Names[i] = sc.next();
        }

        System.out.println("Elements of Array is : ");
        for(int i=0; i<n; i++){
            System.out.println(Names[i]);
        }
    }
}
