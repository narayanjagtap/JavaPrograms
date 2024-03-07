package JavaPrograms.DArray;

/*Reverse an Array:
This program reverses the elements of an array. */

public class ProblemsArray6 {
    public static void main(String[] args) {
        int data[] = {2,3,4,5,6,7,8,9};

        int reversed[] = new int[data.length];

        for(int i=0; i<data.length; i++){
            reversed[i] = data[data.length -1 -i];
        }

        System.out.println("Reversed Array is : ");
        for(int i=0; i<data.length; i++){
            System.out.print(reversed[i] + ", ");
        }
    }
}
