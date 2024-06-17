package Nested_and_pattern_programming;

public class edgelessLettersPattern {


    // problem-1
    static void pattern1(){
        int n=10;
        for(int i =0 ; i < n; i++){
            for(int j =0; j <n; j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j == (n-1)/2 && i > 0 || i==(n-1)/2 && j<=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//    problme-2
    static void pattern2(){
         int n=11;
        for(int i =0 ; i < n; i++){
            for(int j =0; j <n; j++){
                if(i==0 && j>0 && j<n-1 || j==0 && i>0 || j == n-1 && i > 0 || i==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


//    problem3


    static void pattern3(){
        int n =10;
        for(int i = 0 ; i < n ; i++){
            for(int j=0;j<n;j++){
                if(i==0 && j < (n-1)/2 || j==0 || i == (n-1) && j < (n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


//    problem5
    static void pattern4(){
        int n =10;
        for(int i = 0 ; i < n ; i++){
            for(int j=0;j<n;j++){
                if(i==0 && j < (n-1) || j==0 || i == (n-1) && j < (n-1) || j==(n-1) && i>0 && i<(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
//    pattern1();
//    pattern2();
        pattern3();
//        pattern4();


  }
}
