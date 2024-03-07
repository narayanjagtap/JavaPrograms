package JavaPrograms.EStrings;

public class String6 {
    public static void main(String[] args) {
        String s1 = "dada";
        String s2 = "dada";
        String s3 = "Dada";

        System.out.println(s1==s2);    //  == operator:- It compares the reference of the Object.
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));   //  equals():- It compares the contents of two Object.
        System.out.println(s1.equals(s3));
    }
}
