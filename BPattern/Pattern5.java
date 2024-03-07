package JavaPrograms.BPattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n =8;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print(" H ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
