package basicOOPs;

class add{
    static int  add(int n1, int n2){
        int result=n1+n2;
        return result;
    }

    static int  add(int n1, int n2, int n3){
        int result=n1+n2+n3;
        return result;
    }
    static short  add(short n1, short n2){
        int result = n1+n2;
        return (short) result;
    }
    static double  add(double n1, double n2){
        double result=n1+n2;
        return result;
    }
    static long  add(long n1, long n2){
        long result=n1+n2;
        return result;
    }
    static byte  add(byte n1, byte n2){
        int result=n1+n2;
        return (byte) result;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {

        add obj = new add();
        int result=obj.add(25,69);
        System.out.println(result);

    }
}
