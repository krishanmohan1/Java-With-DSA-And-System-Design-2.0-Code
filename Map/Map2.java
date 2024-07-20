package Map;
import java.util.*;

public class Map2 {
    public static void main(String[] args) {

        Hashtable ht = new Hashtable();
        ht.put(1,"Rohit");
        ht.put(2,"Rohan");
        ht.put(3,"Ramshe");
        ht.put(null,"Hyder");
        ht.putIfAbsent(2,"mohan");
        System.out.println(ht);

        TreeMap tm = new TreeMap();

//        Integer i = new Integer(5);  // ye old model hai essiiye depricated haii.
        tm.put(6,"Rohit");
        tm.put(1,"ramshe");
        tm.put(4,"rahul");
        tm.put(3,"Rohasm");
        System.out.println(tm);

//        esme key value sorted order me aayega


    }
}
