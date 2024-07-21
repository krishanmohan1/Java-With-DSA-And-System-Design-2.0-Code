package GenericsAndFilehandling;
import java.util.*;

//
//class Student{
//    int marks;
//    int age;
//    String name;
//
//    public Student(int marks, int age, String name){
//        this.marks = marks;
//        this.age = age;
//        this.name = name;
//
//    }
//    public int getMarks(){
//        return marks;
//    }
//    public int getAge(){
//        return age;
//
//    }
//    public String getName(){
//        return name;
//    }
//    public String toString(){   // by default sabhi class , Object class ka subclass hota hai , ye toString ussi ka method hai jo yaha , Override kiya gya hai, ye jab class ke obj ko call karte hai to uske addresh ko nhi balki, use data ko call karne deta hai, otherwise  hexadecimal no. print hota hai.
//        return "" + marks + "_" + age + " _" + name;
//
//    }
//}
//
//class Alpha implements Comparator<Student>{
//    public int compare(Student a , Student b){  // ye compare method , Comparator me inbuilt hoga hai, esko ye orverride kar rahe hai.
//        if(a.marks>b.marks){        // ye interface me sirf ek he abstract method hai esko hu lambda method se likha sakte hai
//            return 1;  // eska internal meaning hua , swap kara
//        }else{
//            return -1;  // esme internal meaning hua swap nhi karna
//        }
//    }
//}
public class ComparatorVsComaparable4 {

    public static void main(String[] args) {

        Student st1 = new Student(55,21,"Krishan");
        Student st2 = new Student(66,22,"Mohan");
        Student st3 = new Student(77,23,"Chaudhary");


        List <Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(list);
//        Collections.sort(list);         // it give error , due to complex object, i need to tell them on what basis do i need to sort it .
//        Alpha a = new Alpha();

        Comparator<Student> com = (Student a , Student b) ->  // lamda expression use kiye hai.
        {
            if(a.marks<b.marks)
                return 1;
            else
                return -1;
        };

        Collections.sort(list,com);  // eska mtlb hua , list ko a ke anushar sort kar do, rules a ke me define hai.
        System.out.println(list);


    }
}
