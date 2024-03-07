package JavaPrograms.EStrings;

//Reversing String...

public class String16_Reversing {
    public static void main(String[] args) {
        String brand = "PWJava";
        String brand1 = new String();

        for(int i=brand.length()-1; i>=0; i--){
            brand1 = brand1 + brand.charAt(i);
        }

        System.out.println("Before reversing String :- " + brand);
        System.out.println("After reversing String :- " + brand1);
    }
}
