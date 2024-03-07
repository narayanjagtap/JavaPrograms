package JavaPrograms.COopsFandamental;

class calc1{
    public int add(int a, int b){
        int result = a + b;
        return result;
    }
}
public class MethodOverloading2 {
    public static void main(String[] args) {
        calc1 obj = new calc1();

        int result = obj.add(5, 6);
        int result1 = obj.add(5, 8);

        System.out.println(result);
        System.out.println(result1);
    }
}
