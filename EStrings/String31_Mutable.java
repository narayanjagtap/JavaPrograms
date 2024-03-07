package JavaPrograms.EStrings;

public class String31_Mutable {
    public static void main(String[] args) {
        final StringBuffer Name1 = new StringBuffer("Virat"); //final KEYWORD
        Name1.append("Kohali");

        //Name1 = new StringBuffer("Sachin");

        System.out.println(Name1);
    }
}
