package Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(01,"krishan");
        hm.put(02,"Mohan");
        hm.put(03,"chaudhary");
        System.out.println(hm);  // {1=krishan, 2=Mohan, 3=chaudhary} this is the output

        HashMap hm2 = new HashMap();
        hm2.put(null,null);
        hm2.put("virat","virat");
        hm2.put("rohit","virat");
//        hm2.put("virat","virat");   // ye entry nhi print hoga

        // key-value {Dono Object ke type ka store karta hai.}
        // Order of insertion - same rahega jaruri nhi hai
        // Agar Order of Interstion preserve karna hai, to 'LinkedHashMap' use karna hoga.

        // yaha methods ko use karke enske key, value , key-value ko access kar sakte hai .

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(01,"Mohan");
        lhm.put(02,"Krishan");
        lhm.put(03,"chaudharay");
        System.out.println(lhm);  // {1=Mohan, 2=Krishan, 3=chaudharay}


    }

}
