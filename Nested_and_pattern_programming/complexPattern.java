package Nested_and_pattern_programming;



public class complexPattern {



    // pattern1
    static void diagnogal1(){
        int n=21;
        for(int i = 0; i < n ; i++){
            for(int j =0 ; j<n ; j++){
                if( i==j  || i+j==n-1 || i==0 || i==n-1 || j== 0 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




//    problem2
    static void pattern2(){
        int n=11;
        for(int i = 0; i < n ; i++){
            for(int j =0 ; j<n ; j++){
                if( i==j  || i+j==n-1 || i==0 || i==n-1 || j == 0 || j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || (i+j==(n-1)+(n-1)/2)|| j-i == (n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        diagnogal1();
        pattern2();


    }
}
