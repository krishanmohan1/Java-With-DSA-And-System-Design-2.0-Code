package GenericsAndFilehandling;
import java.util.*;

public class Generics1 {
    public static void main(String[] args) {
        // typesafety
        String ar[]=new String[10];
        ar[0]="hyder";
        ar[1]="PW";
//        ar[2]=10;  // it gives compile time error
        String name1 = ar[0];
        String name2 = ar[1];

        // No typesafety
        // type safety is achived using generics

        ArrayList<String> al = new ArrayList<String>();
        al.add("krishan");
        al.add("Mohan");
//        al.add(10);    // it will give complite time error, if there is no generics then will give runtime error at run time , but compliel error
//        String n1 = (String)al.get(0);  // yaha typecastig or DownCasting form Object --> String
//        String n2 =(String)al.get(1);   // jab generics use nhi karte tab., and to store the elemnets then .
//        String n3 = (String)al.get(2);

        String name = al.get(0);
        String name3 = al.get(1);  // jab genterics use karte hai to define ho jata hai kis type ka elemnets
        // Collection me store hoga , phit usko kisi dushre object me store karane ke liye typecasting nhi karna padta hai.






    }
}
