package JavaPrograms.AFundamentalOfJava;

public class TernaryOperator1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int res = (a<b)? a: b;
        System.out.println(res);


        String result = (a>b)? "b is less than a": "b is Greater than a";
        System.out.println(result);

    }
}
