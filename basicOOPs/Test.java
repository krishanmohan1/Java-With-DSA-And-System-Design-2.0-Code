package basicOOPs;

public class Test {

    int a;
    String name;

    public static void main(String[] args) {

        int num = 9; // primitive variable
        Test obj1 = new Test(); // refrenece variable , obj1
        Test obj2 = new Test();
        obj1.a = 9;
        obj1.name="Mohan";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);





    }
}
