package Nested_and_pattern_programming;

public class butterfly {
    public static void main(String[] args) {

//        int n = 9;
//        for(int i =0; i < n ; i++){
//            for(int j = 0 ; j<n;j++){
//                if(j==0||j==n-1||i>=j && j>0 ||i+j==(n-1)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }


        for(int i =0; i<6;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
