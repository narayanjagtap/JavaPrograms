package JavaPrograms.DArray;

public class Array9 {
    public static void main(String[] args) {
        int data[][] ={
            {9,5,3},{0,3,4},{6,3,2},{0,9,6}
        };
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
