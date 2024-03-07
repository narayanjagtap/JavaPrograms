package JavaPrograms.EStrings;

public class String5 {
    public static void main(String[] args) {
        
        String s1 = "PWSkill";
        String s2 = new String("PWSkill");

        System.out.println(s1 == s2);       // == operator:- It compares the reference(s1&s2) of the Object.
        System.out.println(s1.equals(s2));  //  equals():- It compares the contents(pwskill) of two Object.
    }
}
