package JavaPrograms.DArray;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Arr[][] = new int[3][];

        Arr[0] = new int[3];
        Arr[1] = new int[2];
        Arr[2] = new int[4];

        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
                System.out.println("Enter the Class " + i + " and enter the Studenrs in each Class " + j);
                Arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The Marks of Student are bellow ");

        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }

    }
}