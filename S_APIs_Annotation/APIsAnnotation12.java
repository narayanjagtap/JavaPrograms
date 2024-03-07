package JavaPrograms.S_APIs_Annotation;

enum Week{
    MON, TUE, WED, THR, FRI, SAT, SUN;
}

public class APIsAnnotation12 {
    public static void main(String[] args) {
        Week w = Week.FRI;
        System.out.println(w);

        int index = Week.FRI.ordinal(); //This Method gives the index of perticular Day.
        System.out.println(index);

        Week wr[]=Week.values();    //Print all named constant.
        for(Week w1:wr){
            System.out.println(w1 + " : " + w1.ordinal());
        }
    }
}
