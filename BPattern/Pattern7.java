package JavaPrograms.BPattern;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0  ||  i==0 && j<(n-1)/2  ||  j==(n-1)/2 && i>0 && i<(n-1)/2  ||  j==(n-1)/2 && i>(n-1)/2 && i<n-1  ||  i==n-1 && j<(n-1)/2  ||  i==(n-1)/2 && j<(n-1)/2){
                    System.out.print(" B ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

