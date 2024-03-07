package JavaPrograms.COopsFandamental;

class calc{
    public int add(int a , int b){
        int result = a + b;
        return result;
    }
}
public class MethodOverloading1 {
    public static void main(String[] args) {
        calc obj = new calc();

        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(12, 40));
    }
}
