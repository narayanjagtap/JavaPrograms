package JavaPrograms.DArray;

/*Sum of Array Elements :  This program calculates the sum of elements in an integer array.*/

public class ProblemsArray1 {
    public static void main(String[] args) {
        int Arr[] = {4,6,3,2,9,7};
        int sum = 0;

        for(int i=0; i<Arr.length; i++){
            sum += Arr[i];
        }
        System.out.println("Addition of elements in Array is : " + sum);
    }
}
