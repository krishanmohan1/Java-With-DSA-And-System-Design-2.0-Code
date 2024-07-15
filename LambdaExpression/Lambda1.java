package LambdaExpression;

        // lambda expression works on only , @Functional Interface , i.e interface having only one method

@FunctionalInterface
interface  Car{
//    void drive();
//    void drive(int sp);
    void drive(int mod,int speed);
}

// Now i want to use this drive method without creating objects then, lambda expression come in to picture that is .

public class Lambda1 {
    public static void main(String[] args) {
//        Car obj = () -> System.out.println("Driving the wagonar car"+sp);  // if there is only one sentence or one line code no need of {} brackets.
                                                                        // this is for Zero Parameterised Function.
//        Car obj = sp -> {
//            System.out.println("driving at high speed "+sp);      // it is for single parametrised .
//        }

        Car obj = (mod,speed) -> {
            System.out.println("driving car "+ mod + " at speed of "+speed);
        };
//        obj.drive();  it is for zero parameterised method

//        obj.drive(589);  it is for single parameterised
        obj.drive(569,89);
}}

        // This is all Lambda expression.
