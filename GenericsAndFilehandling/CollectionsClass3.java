package GenericsAndFilehandling;
import java.util.ArrayList;

import java.util.Collections;  // this class has many static functions.

public class CollectionsClass3 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(10);
        al1.add(20);
        al1.add(70);
        al1.add(50);
        al1.add(40);

        System.out.println(al1);

        // to sort the arraylist , using Collections Class
        Collections.sort(al1);
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Krishan");
        al2.add("Mohan");
        al2.add("kamal");
        al2.add("Nayan");
        al2.add("mamta");
        al2.add("sudhir");
        System.out.println(al2);
        Collections.sort(al2);  // this will sort the collection
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(10);
        al3.add(20);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);
        al3.add(60);
        // to apply the binary search , required condition is array should be sorted first
        int index=  Collections.binarySearch(al3,30);  // it will return index value of 30 inside the al3 List , if not present there it will return the negative value
        System.out.println("index value of 30 is : "+index);

        Collections.rotate(al3,4);
        System.out.println(al3);

        Collections.shuffle(al3);
        System.out.println(al3);

        int feq=Collections.frequency(al3,20);
        System.out.println(feq);





    }
}
