package OOPSinJAVA;

public class Constuctor {
    public static void main(String[] args) {

        System.out.println(Student.numOfStudent); //100


        Student s1 = new Student();  // es contructor me koi paramter pass nhi hua hai .eske liye default contructor hai
//        s1.name="krishan";
//        s1.rno=89;
//        s1.percent=58.6;

//        System.out.println(s1.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.percent);
        System.out.println(s1.schoolName);



//        Student s2 = new Student("mohan",85,56.8);   // eske liye parameterised contructor
//        System.out.println(s1.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.percent);

    }
}
