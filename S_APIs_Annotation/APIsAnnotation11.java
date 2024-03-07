package JavaPrograms.S_APIs_Annotation;

enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class APIsAnnotation11 {

    enum Result{
        PASS, FAIL, NORESULT;
    }

    public static void main(String[] args) {
        Week w = Week.FRI;
        System.out.println(w);

        Result r = Result.PASS;
        System.out.println(r);

    }
}
