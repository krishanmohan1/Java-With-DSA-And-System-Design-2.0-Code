package Interface;

        // How To Run Interfaces
interface A1 {      // it is like a set instruction that evey class will implement
    void show();
}

interface X{
    void abc();
}

class B implements A1,X{  // here is example of multiple Inheritance of interfaces
    public void show(){
        System.out.println("In show..");
    }
    public void abc(){
        System.out.println("in abc..");
    }

}

public class Interface2 {
    public static void main(String[] args) {
        B obj = new B();        // A obj = new B(); it is also right.
        obj.show();
        obj.abc();


    }
}
