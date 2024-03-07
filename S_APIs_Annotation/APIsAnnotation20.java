package JavaPrograms.S_APIs_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) //Set the power of Annotation.
@interface CricketPlayer{
    String Country();   //Need to pass the value of Country in Annotation.
    int Age()default 35;    //Not Need to pass the value of Age in Annotation. because you are set the default Age(35).
}



@CricketPlayer(Country = "India")   //pass the value of Country.
class Rohit2{

    @CricketPlayer(Country = "India")   //pass the value of Country.
    private int innings;
    private int runs;
    
    @CricketPlayer(Country = "India")   //pass the value of Country.
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

public class APIsAnnotation20 {
    public static void main(String[] args) {
        
        Rohit2 r = new Rohit2();
        r.setInnings(150);
        r.setRuns(17000);

        System.out.println(r.getInnings());
        System.out.println(r.getRuns());

    }
}