package JavaPrograms.EStrings;

public class String1 {
    public static void main(String[] args) {
        String Brand = "PW";    //immutable / nonchangeble String
        System.out.println(Brand);
        Brand.concat("Skill");//concat method aage padayee jayegi. in this case just assum concat method are use only aadtion of string.
        System.out.println(Brand);
        System.out.println("++++++++++++++++++++++++++++++++++");

        StringBuilder Brand1 = new StringBuilder("PW"); //mutanle / changeble String.
        System.out.println(Brand1);
        Brand1.append("Skill");//append method aage padayee jayegi. in this case just assum append method are use only aadtion of builder\buffer string.
        System.out.println(Brand1);
    }
}
