package JavaPrograms.EStrings;

import java.util.Arrays;

public class String21_Anagram {
    public static void main(String[] args) {
        
        String Name1 = "School Master";
        String Name2 = "The Classroom";

        Name1 = Name1.replace(" ", "");
        Name2 = Name2.replace(" ", "");

        Name1 = Name1.toLowerCase();
        Name2 = Name2.toLowerCase();

        char data1[] = Name1.toCharArray();
        char data2[] = Name2.toCharArray();

        Arrays.sort(data1);
        Arrays.sort(data2);

        if(Arrays.equals(data1 , data2)){
            System.out.println("Given Strings are Anagrams...");
        }
        else{
            System.out.println("Given String are NOT Anagram....");
        }
        
    }
}
