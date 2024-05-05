package JavaPrograms.EStrings;

//Find String are Palindrom or NOT

public class String19_Palindrom {
    public static void main(String[] args) {
        String Name = "madam";
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




/*public class Practice2 {

    public static void main(String[] args) {
        String data = "madam";
        int flage = 0;

        for(int i=0; i<data.length()/2; i++){
            if (data.charAt(i)!=data.charAt(data.length()-1-i)) {
                flage = 1;
            }
        }
        if (flage == 0) {
            System.out.println("This String are a Palindrom...");
        }else{
            System.out.println("This string are not Palindrom...");
        }
    }
}
 */