package Nested_and_pattern_programming;

public class traingale3 {
    public static void main(String[] args) {
        int n=7;
        for(int i =0; i < n ; i++ ){
            for(int j = 0; j< n;j++){
                if(i==n-1||j==0||i>=j){
                    System.out.print("1");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
