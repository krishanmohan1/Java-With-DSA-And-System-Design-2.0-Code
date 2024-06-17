package operators;

public class main{
    public static void main(String[] args) {
        System.out.println("operators");
        int a = 5 ;
        int b = a++;
        int w = a++ + ++a + --a;
        System.out.println(w);
        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y = ++x;  // pre increement
        System.out.println(x);
        System.out.println(y);

        int k = 5;
        int m ;
        m= k++ + ++k  + k++ + --k + k--;
        System.out.println(k);
        System.out.println(m);
    }
}
