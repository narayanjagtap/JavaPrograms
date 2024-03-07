package JavaPrograms.EStrings;

public class String18_Reversing {
    public static void main(String[] args) {
        String brand = "PWSkill Java";
        String brand1 = " ";

        for(int i=brand.length()-1; i>=0; i--){
            brand1 = brand1 + brand.charAt(i);
        }

        System.out.println(brand1);
    }
}
