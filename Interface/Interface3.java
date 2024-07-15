package Interface;

interface Computer{
    void compileCode();
}
//class Laptop implements Computer{
//    public void complieCode(){
//        System.out.println("5 error ");
//    }
//}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("5 error , faster");
    }
}

class Developer {
    public void buildApp(Computer obj){
        System.out.println("Building App");
        obj.compileCode();
    }
}



public class Interface3 {
    public static void main(String[] args) {

        Computer obj = new Desktop();
//        Developer dev  new Developer();
//        dev.buildApp(obj);

    }
}
