package JavaPrograms.DArray;

public class Array7 {
    public static void main(String[] args) {

        int data[][] = new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
 //output is zero for all placeses becouse you are not insert value for each place.