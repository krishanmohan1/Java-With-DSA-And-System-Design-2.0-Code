package String;

public class MutableString {
    public static void main(String[] args) {

////        StringBuffer  sb = new StringBuffer("virat");
//        StringBuilder sb = new StringBuilder("virat");
//
////        StringBuffer sb = "virat"; // it is invalid to create String Object this way in immutable string
//        System.out.println(sb);
//
//        sb.append(" kohli");
//        System.out.println(sb);


//        String s = new String("virat");
//        s=s.concat("kohli");
//        System.out.println(s);
//
//        StringBuffer sb = new StringBuffer("virat");
//        sb.append("kohli");
//        System.out.println(sb);
//
//
//
//        final StringBuffer sb1 = new StringBuffer("virat");
//        sb1.append("Kohali");
//        System.out.println(sb1);


//        StringBuffer sb = new StringBuffer();  // Empty String Object
//        System.out.println(sb.capacity()); // 16
//        sb.append("abcdefghijklmnop"); // sb is added these string
//        System.out.println(sb.capacity()); //6
//        sb.append("s"); // now sb is changed and s is added to it.
//        System.out.println(sb.capacity()); // (16+1)*2=34 how many characters you can add
//        System.out.println(sb.length()); // 17 how many characters are present there
//
//        StringBuilder sb2 = new StringBuilder("Sachin");
////        sb2.append("Sachin");
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.charAt(0));
//        sb2.setCharAt(1,'A'); // setChar() method void rerturn type ka hai , isiliye direct esko print nhi ar sakte hai
//
////        System.out.println(sb2.setChar(1,'B'));  ye invalid hai
//        System.out.println(sb2);

        StringBuilder sb = new StringBuilder("pwjava");
        System.out.println(sb);
        System.out.println(sb.reverse());


//        int [] a = new int[5];
////        a[0]=5;
////        a[1]=6;
//        System.out.println(a[4]);

        String s1 = "mohan";
        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();
        System.out.println(s2);

        short a = 10;
        short b = 5;
        a=(short)(a+b);
        System.out.println(a);









    }
}
