package JavaPrograms.AFundamentalOfJava;

public class ReturnStatemant1 {
    
    public int add(int a, int b){

        int c = a+b;
        return c;

    }

    public static void main(String[] args) {
   
    ReturnStatemant1 a = new ReturnStatemant1();
    
       int d = a.add(5,9);

        System.out.println(d);
    }
}
