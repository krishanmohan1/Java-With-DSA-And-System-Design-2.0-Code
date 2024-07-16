package ExceptionHandelling;

        // Custome exception and trow keyword

// custome exception
class MyException extends Exception{
    public MyException(){

    }
    public MyException(String str){
        super(str);  // to call custom message .

    }
}


public class ExceptionHandeling5 {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = -2;       // 0,-2

        try
        {
            if(num2<0)
            {
                Exception e1 = new MyException("Cutsom message");  // custom exception., custom message pass karna hai to.
                Exception e = new Exception("Negative number");  // Exception ka object hai ye , yaha object exception ke jagah par , type of exception bhi rakh sakte hai, lie ArithemeticException
                throw e1;  // ye exception ko throw karega jo ki catch block me hai .wo print ho jayega .
            }

        }
        catch(Exception e1)
        {
            System.out.println("Enter valid number "+e1);
        }

    }
}
