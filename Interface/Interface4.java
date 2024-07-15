package Interface;
        //JAVA 8 Features Over Interfaces:
        // 1. Default Method in Interfaces
        // 2. Static Method in Interfaces
        // 3. Functional interfaces

interface A2{
    void disp();        // it is compulsory for it to Override
    default void config(){   // it is non static method it will be called using object , this can be override, here it is not compusory
        System.out.println("in config.. ");
    }
    static void abc(){      // it is static , it will be called using interface only , like in case of class, it will not override
        System.out.println("in abc..");
    }
}
class B2 implements A2{
    public void disp(){
        System.out.println("in disp..");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        B2 obj = new B2();  // A2 obj = new B2(); can also true here .
        A2.abc();
        obj.disp();
        obj.config();
    }
}
