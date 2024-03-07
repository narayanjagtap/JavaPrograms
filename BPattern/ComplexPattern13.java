package JavaPrograms.BPattern;

public class ComplexPattern13 {
    public static void main(String[] args) {
        int n = 20;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                if(i==(n-1)  ||  j==0 && i>(n-1)/4  ||  j==(n-1)/2 && i>(n-1)/4  ||  j==(n-1) && i>(n-1)/4  ||  
                i==(n-1)/4  ||  i==0 && j>(n-1)/4 && j<=((n-1)/2)+((n-1)/4)  ||  i+j==((n-1)/4)  ||  j-i==(n-1)/4 && i<(n-1)/4  ||  
                j-i==((n-1)/2)+((n-1)/4)+1 && i<(n-1)/4  ||  j==(n-1)/5 && i>=((n-1)/2)+((n-1)/4)  ||  
                j==((n-1)/2)-((n-1)/6) && i>=((n-1)/2)+((n-1)/4)  ||  i==((n-1)/2)+((n-1)/4) && j<=((n-1)/2)-((n-1)/6)  && j>=(n-1)/5)
                {
                    System.out.print(" + ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
