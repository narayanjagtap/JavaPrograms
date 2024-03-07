package JavaPrograms.EStrings;

public class String17_Reversing {
    public static void main(String[] args) {
        String brand = "PWSkill Java";
        String brand1 = " ";

        String brand3[] = brand.split(" ");

        for(int i=brand3.length-1; i>=0; i--){
            brand1 = brand1 + brand3[i] + " ";
        }
        System.out.println(brand1);
    }
}
