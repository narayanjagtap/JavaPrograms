package JavaPrograms.S_APIs_Annotation;

//Create Custom Annotation
@interface CricketPlayer{

}


//Custom Annotation
@CricketPlayer
class Rohit{
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

public class APIsAnnotation17 {
    public static void main(String[] args) {

        //Custom Annotation
        @CricketPlayer
        Rohit r = new Rohit();
        r.setInnings(200);
        r.setRuns(15000);

        System.out.println(r.getInnings());
        System.out.println(r.getRuns());

    }
}
