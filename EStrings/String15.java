package JavaPrograms.EStrings;

public class String15 {
    public static void main(String[] args) {
        String Name = "Narayan Jagtap ";

        System.out.println(Name);
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.length());
        System.out.println(Name.charAt(4));
        System.out.println(Name.substring(2, 11));
        System.out.println(Name.indent(5));
        System.out.println(Name.indexOf("a"));
        System.out.println(Name.lastIndexOf("a"));
        System.out.println(Name.contains("p"));
        System.out.println(Name.replace("a","p"));
        System.out.println(Name.trim());//to remove whiteSpaces...
    }
}
