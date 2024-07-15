package InnerClass;

interface Car{
    void drive();
}

//class WagonR implements Car{         // what if es class ko sirf ek he baar use karna hai code me to esko aise kyu likhna , esko maintain karna padta hai
//    public void drive(){
//        System.out.println("Driving ....");
//    }
//}



public class AnonymousClass {
    public static void main(String[] args) {

//        Car obj = new Car(); // it is not correct kyu ki ye , Interface  ka object bana rahe ho , which is wrong
        // ye ban sakta hai interface ko refrence karke , wagonR class ka object , which will call merhod drive



        // yaha semi colon se pahle ek block me method define kar dena hai, ye batata hai ek anonymous class bana hua hia
        // jiska sirf ek baar he use ho rha hai.
        Car obj = new Car() {
        public void drive(){
            System.out.println("Driving...");
        }
    };
        obj.drive();        // ye us class ka object hua.


    }
}
