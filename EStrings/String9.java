package JavaPrograms.EStrings;

public class String9 {
    public static void main(String[] args) {
        String s1 = "pwjava";
        String s2 = new String("PWJAVA");
        String s3 = new String("pwjava");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);

        System.out.println(s1.equalsIgnoreCase(s2));  //becouse ye method upper case ya lower case ignore karata hai.
        System.out.println(s1.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
