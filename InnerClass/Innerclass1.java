package InnerClass;

        // there are 3 types of inner class
        // 1. -member, 2.-static , 3. -Anonymous

class X{

    public void inX(){
        System.out.println("method  in X");
    }

    class Y{  // here it  is member class of , X and it can static or non-static

        public void inY(){
            System.out.println("method in Y");
        }
    }

    static class Z{
        public void inZ(){
            System.out.println("method in Z");
        }

    }

}

public class Innerclass1 {
    public static void main(String[] args) {

        X obj = new X(); // it is object of X class
        obj.inX();      // call method of Class X

        // how to create object of member class Y
        // Y obj1 = new Y();  it is wrong
        // Y is inside of X , so

        X.Y obj1 = obj.new Y();  // it is inner class non static
        obj1.inY();

        // now create object of static inner class
        // but it is static it dont required object to call the method of inner class Z

        X.Z obj3 = new X.Z();  // this is the way to create the object of static inner class
        obj3.inZ();



    }
}
