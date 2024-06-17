package Nested_and_pattern_programming;

import java.util.Scanner;

public class triangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n =7 ;

        for(int i = 0; i < n ; i++){
            for(int j = 0; j< n ; j++){
                if(i ==0 || j == 0 || i+j<=(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





    }
}
