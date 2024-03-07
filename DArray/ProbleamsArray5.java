package JavaPrograms.DArray;

/*Search for an Element:
This program searches for a specific element in an array. */

public class ProbleamsArray5 {
    public static void main(String[] args) {
        
        int Array[] = {3,5,2,9,7,5,2,1};

        int Target = 55;  // The element to search in Array.

        boolean found = false;

        for(int i=0; i<Array.length; i++){
            if(Array[i] == Target){
                found = true;
            }
        }

        if(found){
            System.out.println("Elements " + Target + " are found in Array");
        }
        else{
            System.out.println("Elements " + Target + " are NOT found in Array");
        }
    }
}
