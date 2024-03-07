package JavaPrograms.EStrings;

public class String8 {
    public static void main(String[] args) {
        String s1 = "pwSkill";
        String s2 = new String("PWSkill");
        String s3 = new String("pwSkill");
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }
}
