package JavaPrograms.BPattern;

public class ComplexPattern12 {
    public static void main(String[] args) {
        int n = 40;
        int m = 20;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if( j==(m-1)/2 && i<=((n-1)/2)+((n-1)/4)  ||  i==n-1  ||  i==((n-1)/2)+(n-1)/4  ||  
                j==0 && i>=((n-1)/2)+(n-1)/4  ||  j==m-1 && i>=((n-1)/2)+(n-1)/4  ||  
                i==0 && j>=(m-1)/2  ||  i==(n-1)/4 && j>=(m-1)/2  ||  j==m-1 && i<(n-1)/4  ||  
                i==(n-1)/12 && j>=(m-1)/2  ||  i==((n-1)/12)+((n-1)/12) && j>=(m-1)/2  ||  
                i==(n-1)/8 && j>((m-1)/2)+((m-1)/5) && j<(m-1)-((m-1)/5)  ||  
                i==(n-1)/7 && j>((m-1)/2)+((m-1)/5) && j<(m-1)-((m-1)/5)  ||  
                i>=((n-1)/2)+(n-1)/4 && i<=(n-1) && j>=0 && i>=((n-1)/2)+(n-1)/4 && j<=m-1 && i>=((n-1)/2)+(n-1)/4
                )
                {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
