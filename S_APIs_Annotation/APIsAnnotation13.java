package JavaPrograms.S_APIs_Annotation;

enum Result{
    PASS, FAIL, NR; //Declear Constant.
    //jitane Constant declere kia hain enum main, utanibar constructor call hoga in OutPut Section,

    int marks;  //Creat variable,

    Result(){   //Constructor
        System.out.println("Constructor in enum..");
    }

    void setMarks(int marks){   //Setter
        this.marks=marks;
    }

    int getMarks(){     //Getter
        return marks;
    }
}

public class APIsAnnotation13 {
    public static void main(String[] args) {

        Result.PASS.setMarks(50);

        int m1 = Result.PASS.getMarks();
        System.out.println(m1); //50

        int m2 = Result.FAIL.getMarks();
        System.out.println(m2); //0
    }
}
