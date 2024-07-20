package FilehandlingOrInputOutput;

class Student{
    private String name;
    private int age ;
    private String city;

    public Student(String name , int age , String city){
        this.name = name ;
        this.age = age;
        this.city=city;
    }

    // Object class me toString(), method ko Overide karne se Adress ke jagah ,  data print hoga, jiiska return type String hota hota hai
    public String toString(){
        return "Name : "+name+" | age is : "+age + "| city is : "+city;
    }

}

public class IOFundamental1 {
    public static void main(String[] args) {
        Student st1 = new Student("Krishan" , 21,"Begsarai");
        Student st2 = new Student("Kamal",23,"pune");

        System.out.println(st1);
        System.out.println(st2);

        // Without toString Method it return you the , Adress of object st1 , st2 .


    }
}
