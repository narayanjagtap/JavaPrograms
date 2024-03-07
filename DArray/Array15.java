package JavaPrograms.DArray;

class calc{
    public int add(int a, int b){
        int result = a + b;
        return result;
    }
}
public class Array15 {
    public static void main(String[] args) {
        calc obj = new calc();
        int result = obj.add(12, 15);
        System.out.println(result);
    }
}