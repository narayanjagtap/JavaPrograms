package JavaPrograms.COopsFandamental;

class calc2{
    public int add(int a, int b){
        int result = a + b;
        return result;
    }
    public int add(int a, int b, int c){
        int result1 = a + b + c;
        return result1;
    }
    public double add(double a, double b){
        double result2 = a + b;
        return result2;
    }
}
public class MethodOverloading3 {
    public static void main(String[] args) {
        calc2 obj = new calc2();

        int result = obj.add(12, 12);
        int result1 = obj.add(12, 12, 12);
        double result2 = obj.add(40.4, 20.6);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
