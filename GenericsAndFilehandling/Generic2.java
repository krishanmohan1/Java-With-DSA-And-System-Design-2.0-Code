package GenericsAndFilehandling;

import java.util.*;

class Gen<T>{
    T obj;

    public Gen(T obj){
        this.obj=obj;

    }
    void disp(){
        System.out.println("The type of data is : "+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }

}

public class Generic2 {
    public static void main(String[] args) {

        Gen<Integer> g = new Gen<Integer>(10);
        g.disp();
        System.out.println(g.getObj());

        System.out.println("_________________________________");

        Gen <String> g1 = new Gen<String>("pw");
        g1.disp();
        System.out.println(g1.getObj());


//        ArrayList <String> list1 = new ArrayList<>();
//        List <String> list2 = new ArrayList <String>();
//        Collection <Integer> list3 = new ArrayList<>();
////        List <Object> list4 = new <Integer>();
//        List<Integer> list5 = new ArrayList<Integer>();
////        List<int> list6 = new ArrayList<>();  primitive data type nhi ho sakta hai , object dena hoga



    }
}
