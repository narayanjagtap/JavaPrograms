package JavaPrograms.S_APIs_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) //Set the power of Annotation.
@interface CricketPlayer{

}


@CricketPlayer  //Custom Annotation
class Rohit1{

    @CricketPlayer  //Custom Annotation
    private int innings;
    private int runs;
    
    @CricketPlayer  //Custom Annotation
    public void setInnings(int innings){
        this.innings=innings;
    }
    public int getInnings(){
        return innings;
    }

    public void setRuns(int runs){
        this.runs=runs;
    }
    public int getRuns(){
        return runs;
    }
}

public class APIsAnnotation19 {
    public static void main(String[] args) {
        
        Rohit1 r = new Rohit1();
        r.setInnings(150);
        r.setRuns(17000);

        System.out.println(r.getInnings());
        System.out.println(r.getRuns());
    }
}