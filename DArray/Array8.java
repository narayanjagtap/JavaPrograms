package JavaPrograms.DArray;

public class Array8 {
    public static void main(String[] args) {

        int data[][] = new int[4][4];

        data[0][0] = 20;
        data[0][1] = 25;
        data[0][2] = 30;
        data[0][3] = 55;
        data[1][0] = 35;
        data[1][1] = 45;
        data[1][2] = 55;
        data[1][3] = 12;
        data[2][0] = 32;
        data[2][1] = 77;
        data[2][2] = 35;
        data[2][3] = 12;
        data[3][0] = 98;
        data[3][1] = 32;
        data[3][2] = 54;
        data[3][3] = 69;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
