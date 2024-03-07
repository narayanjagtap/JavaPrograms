package JavaPrograms.DArray;

/*Find minimum Element:
This program finds the minimum element in an array. */

public class ProblemsArray3 {
    public static void main(String[] args) {
        int Array[] = {4,7,2,5,10};

        int min = Array[0];

        for(int i=1; i<Array.length; i++){
            if(min>Array[i]){
                min = Array[i];
            }
        }
        System.out.println("Minimum element is : " + min);
    }
}
