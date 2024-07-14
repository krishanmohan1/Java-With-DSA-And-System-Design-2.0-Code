package Interface;

interface A{
    int num=21;  // here i have assign value because it is static.
    void show();   // this method is abstract by default , i cannot give its body or define it
}

public class Interface1 {
    public static void main(String[] args) {
        System.out.println(A.num); //  here nums is called using Interface as it is static , as in case of class
//        A.num=56; A cannot be modified , as it is final by default inside interface

//        A obj = new A();   it cannot be instantiated , as object nhi ban sakta hai interface ka.
    }
}
