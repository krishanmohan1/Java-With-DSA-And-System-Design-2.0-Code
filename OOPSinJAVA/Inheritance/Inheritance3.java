package OOPSinJAVA.Inheritance;

        // Multi-Level Inheritance

class Animal{  // this animal class extends Inbuilt class Object
    void sleep(){
        System.out.println("Animal need sleep");
    }
}

class Tiger extends Animal{
                            /*
                            As a developer i can see the code of parente class here
                            but in the backend , code of parent class is inherited here,
                            but the private member and constructor will not get inherited.
                             */

}

class Monkey extends Animal{

}
class Deer extends Animal{

}

public class Inheritance3 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.sleep();


    }
}
