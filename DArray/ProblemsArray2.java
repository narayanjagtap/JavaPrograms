package JavaPrograms.DArray;

/*Find Maximum Element:
This program finds the maximum element in an array. */

public class ProblemsArray2 {
    public static void main(String[] args) {
        
        int Array[] = {9,7,5,3,0,23};

        int max = Array[0];

        for(int i=1; i<Array.length; i++){
            if(Array[i]>max){
                max = Array[i];
            }
        }
        System.out.println("maximum number is : " + max);
    }
}
