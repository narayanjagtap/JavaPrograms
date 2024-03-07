package JavaPrograms.EStrings;

public class String20_Palindrom {
    public static void main(String[] args) {
        String Name = "madan";
        String Name1 = "";

        for(int i=Name.length()-1; i>=0; i--){
            Name1 = Name1 + Name.charAt(i);
        }

        if(Name.equals(Name1)){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is NOT Palindrome");
        }
    }
}
