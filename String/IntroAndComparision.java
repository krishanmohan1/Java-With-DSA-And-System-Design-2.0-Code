package String;

public class IntroAndComparision {
    public static void main(String[] args) {
//        String s1 = new String("Mohan BaBa");
//        String s2 = new String("Mohan BaBa");
//
//        String s3 = "Mohan BaBa";
//        String s4 = "Mohan BaBa";
//
//
//        System.out.println(s1==s3); // it compares the refenece varibale address

//        System.out.println(s1.equals(s3));  // it compares the content of string

//        System.out.println(s1==s2);
//        System.out.println(s3==s4);



//        String s1 = "pwjava";
//        String s2 = "pwjava";
//        String s3 = "pwJAVA";
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

        String s1 = "pwskill";
        String s2 = new String("pwskill");
        String s3 = new String("pwskill");
        String s4 = new String("PWSKILL");

        System.out.println(s1==s2);  // false
        System.out.println(s2==s3); // false
        System.out.println(s1==s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true

        System.out.println(s2.equalsIgnoreCase(s4 ));




    }
}
