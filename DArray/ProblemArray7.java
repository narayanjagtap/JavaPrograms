package JavaPrograms.DArray;

/*Reverse an Array:
This program reverses the elements of an array. */

public class ProblemArray7 {
    public static void main(String[] args) {
        int data[] = {1,2,3,4,5,6,7,8,9};

        for(int i=data.length-1; i>0; i--){
            System.out.println(data[i]);
        }
        
    }
}
