package JavaPrograms.EStrings;

//A string is a pangram string if it contains all the character of the alphabets ignoring the case of the alphabets.

public class String24_Panagram {
    public static void main(String[] args) {

        boolean flag=false;

        String str="The quick brown fox jumps over the lazy dog";

        str=str.replace(" ", "");

        str=str.toUpperCase();

        char []ch=str.toCharArray();

        int ar[]=new int[26];
        
        for(int i=0; i<ch.length; i++)
        {
            ar[ch[i]-65]++;
        }
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It is not pangram");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Its Pangram");
        }
    }
}