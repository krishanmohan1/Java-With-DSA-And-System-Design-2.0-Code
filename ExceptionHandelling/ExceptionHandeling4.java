package ExceptionHandelling;

        // throws keyword

class Demo{
    public void a() throws Exception
    {
        b();
    }
    public void b() throws Exception  // Yaha Exception ka type likhna jada , good practice hai type of exception likhna jaise ki ArithmeticException
    {
        int num1 = 5;
        int num2 = 0;
        int res = num1/num2;
        System.out.println(res);
    }
}

public class ExceptionHandeling4 {
    public static void main(String[] args) {

        Demo obj = new Demo();
        try{
            obj.a();
        }
        catch(Exception e )
        {
            System.out.println("error "+ e.getMessage());  // e.getMessage() use karne se sirf kya error wo message hoga , type of exception nhi aayega jaise ki - / by zero
        }



    }
}
