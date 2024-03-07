package JavaPrograms.FStaticKeyword;

public class Static1 {

    static int age;                        //first exicute

    static{                                //second exicute
        age = 20;
        System.out.println("static block first exicute");
        System.out.println(age);
    }

    static void disp(){                      //jab ham main method me call karenge tab exicute hoga.
        System.out.println("static display method jab ham call karenge tab exicute hoga");
    }

    public static void main(String[] args) {
        System.out.println("main method badhme");  //aur main method static class, static block ke bad exicute hogi. as per the java rule.
        disp();
    }
}
