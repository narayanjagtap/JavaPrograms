package JavaPrograms.DArray;

class calc2{
    public int add(int data[]){
        int result = 0;
        for(int n:data){
            result = result + n ;
        }
        return result;
    }
}
//This progtam on Anonymous Array,

public class Array16 {
    public static void main(String[] args) {
        calc2 obj = new calc2();
        int data[] = {9,6,7,3,5,4};
        int result = obj.add(data);
        System.out.println(result);
    }
}
//this file are nor run in this folder. there for this file are run in other(Practic folder) or eclips IDs.