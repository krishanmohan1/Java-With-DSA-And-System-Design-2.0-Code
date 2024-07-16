package ExceptionHandelling;

         // with multiple catch block

public class ExceptionHandelling2 {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 0;
        int res = 0;
        int values[] = {4,5,8,6};
        String name = null;
        try{
            res = num1 / num2;
            System.out.println(values[2]);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
        }

        System.out.println(res);
        System.out.println("Bye.");;

    }
}
