package Nested_and_pattern_programming;


import java.util.Scanner;

public class first {

    // problem-1
    static void pattern1(){
        int n =5;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // problem-2

    static void pattern2(){

        int n =10;
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // problem-3

    static void pattern3(){
        int n = 5;
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==0 || i==(n-1)/2 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // problem-4

    static void pattern4(){
        int n= 5;
        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < 5; j++){
                if(i==3 || j==0 || j==4){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    // problem-5

    static void pattern5(){
        int n = 5;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                if(i==0 || i == 4 || j == (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


//     prpblem-6

    static void pattern6(){
        int n = 6;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                if(i==0 || i==(n-1)/2 || i==(n-1) || j == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    // pattern 7

    static void pattern7(){
        int n = 5;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                if(i== 0 || i==(n-1)/2 || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        pattern1();
//        pattern2();
//        pattern3();

//        pattern4();
//        pattern5();
//        pattern6();
        pattern7();




    }
}
