package JavaPrograms.DArray;

public class Array10 {
    public static void main(String[] args) {
        int data[][] = {
            {4,5,3},{9,9,7,0,5,4},{2,4,5,2}
        };

        for(int i=0; i<3; i++){
            for(int j=0; j<data[i].length; j++) //This is a special condition for Jagged Arrays.
            {
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
