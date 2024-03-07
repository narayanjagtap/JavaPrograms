package JavaPrograms.DArray;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the numbers of Classes :  ");
        int Classes = sc.nextInt();

        System.out.print("Please Enter the numbers of student in each class :  ");
        int StCount = sc.nextInt();

        int data[][] = new int[Classes][StCount];

        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.println("Please Enter the Marks of Student :  ");
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println("The marks of student are bellow");

        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
