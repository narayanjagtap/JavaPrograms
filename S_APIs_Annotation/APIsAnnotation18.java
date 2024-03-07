package JavaPrograms.S_APIs_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)   //then This Annotation use only on a "Class". because Target is set as TYPE.
@interface CricketPlayer{

}


@CricketPlayer
class Rohit1{
    private int innings;
    private int runs;
    
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

public class APIsAnnotation18 {
    public static void main(String[] args) {
        
        Rohit1 r = new Rohit1();
        r.setInnings(150);
        r.setRuns(17000);

        System.out.println(r.getInnings());
        System.out.println(r.getRuns());
    }
}
