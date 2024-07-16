package ExceptionHandelling;

        // there are two kind of statements are there , 1.)normal statements, 2.) critical statements

        // always put critical statements inside , try{} block , and what kind of Exception or error it can give in that catch(){} block
public class ExceptionHandelliing1 {
    public static void main(String[] args) {
        System.out.println("Hello Syntax error or Compile time error, like there small s instead of capital S in System");

//        int x = 6;
//        int y =3;                          // if here is y = 0; then it will give exception, that occur at runtime .
//        int res = x/y;
//        System.out.println(res);

        int a = 10;
        int b = 0;
        int res =0 ;

        try{
            res = a / b;
            System.out.println("Normal Sentence is not good practice here , put it outside of try block");
            // if exception occur here , there will be no , execution of this statment it will through directly to catch statemnet
        }
        catch (Exception obj)          // Here obj is obj of Exception class ,
        {
            System.out.println("Denominator is 0 "+ " the type of exception is "+ obj);
        }
        System.out.println(res);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Exception handelling Started here , it is fist way to handel exception.");


    }
}
