import java.util.*;
class Pattern{
    static void Pattern01(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Total no. of row:");
    int n = sc.nextInt();
    Pattern01(n);
}
}