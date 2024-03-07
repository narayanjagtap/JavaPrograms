package JavaPrograms.DArray;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numbers of elements in array :  ");
        int n = scan.nextInt();
        int data[] = new int[n];
        
        System.out.println("Enter the elements in Array : ");
        for(int i=0; i<n; i++){
            data[i] = scan.nextInt();
        }

        System.out.print("Elements of the Array is : ");
        for(int i=0; i<n; i++){
            System.out.print(data[i] + ", ");
        }
    }
}