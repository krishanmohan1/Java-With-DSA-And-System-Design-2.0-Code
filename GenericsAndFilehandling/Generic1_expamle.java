package GenericsAndFilehandling;

import java.util.ArrayList;

class Student1{
    private String name ;
    private int age;
    private int roll;

}
class Employe{
    private int salary;
    private String name;

}

public class Generic1_expamle {
    public static void main(String[] args) {

        Student1 st1 = new Student1();
        Student1 st2 =new Student1();

        Employe em = new Employe();

        ArrayList <Student1> al = new ArrayList<Student1>();
        al.add(st1);
        al.add(st2);
//        al.add(em);     // it give error because , the ArrayList
        // will contain the objects of Only Student1 Type Only, and the em is Employee type .
        // here the typesafety is achived.
    }
}
