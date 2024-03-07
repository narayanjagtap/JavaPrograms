package JavaPrograms.S_APIs_Annotation;

enum Result1{
    PASS, FAIL, NR;
}

public class APIsAnnotation14 {
    public static void main(String[] args) {
        
        Result1 res = Result1.PASS;

        switch (res) {

            case PASS:System.out.println("Passed...");
                break;
            
            case FAIL: System.out.println("Faild...");
                break;

            case NR: System.out.println("No Result...");
        }
    }
}
