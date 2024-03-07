package JavaPrograms.S_APIs_Annotation;

enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class APIsAnnotation10 {
    public static void main(String[] args) {
        //We cannot create object of enum class in main Method.
        //So....
        
        Week w = Week.MON;
        System.out.println(w);

    }
}
