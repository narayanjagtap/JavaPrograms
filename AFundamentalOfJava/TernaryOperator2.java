package JavaPrograms.AFundamentalOfJava;

public class TernaryOperator2 {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 50;

        int result = (a<b)? ((a<c)? a: b): ((b<c)? b: c);
        System.out.println(result);
    }
}
