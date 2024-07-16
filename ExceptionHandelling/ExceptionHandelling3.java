package ExceptionHandelling;
        // Resource close karn and finallay keyword,  try with resource .

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandelling3 {
    public static void main(String[] args) {

        int num = 0;

    // try with resource.
        try(Scanner sc = new Scanner(System.in)){  // yaha par , try block execute hoga, resource build hoga then resource automatically close ho jayega , chahe exception aaaye ya na aaye
            num=sc.nextInt();
//            sc.close();   // yaha daalenge to jab exception nhi aayega tabhi jake , resource close hoga
        }

        catch (InputMismatchException e ){
            System.out.println("enter integer");
//            sc.close();  // yaha daalenge to jab exception aayega tabhi close hoga , DRY yaha voilte ho rha hai.
        }

//        finally
//        {
//            sc.close();
//            System.out.println("Resource Closed");
//        }
        System.out.println(num);

    }
}

//      DRY - Do Not Repeat
