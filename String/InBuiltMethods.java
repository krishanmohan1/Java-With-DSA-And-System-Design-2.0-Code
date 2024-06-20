package String;

public class InBuiltMethods {
    public static void main(String[] args) {
        String s1 = "PW skill java ";
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
//        int length = s1.length();

        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,s1.length())); // (3,14)


        System.out.println(s1.indexOf("j"));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));


    }
}
