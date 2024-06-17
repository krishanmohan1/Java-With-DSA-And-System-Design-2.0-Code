package operators;

public class ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String rest = (a<b)?"a is  less" : "a is more";
        System.out.println(rest);
    }
}
