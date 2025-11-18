import java.util.Scanner;

public class Fibonacii_rec {
    public static int fibonacii(int n){
        if(n<=1){
            return n;
        }

        return fibonacii(n-1) + fibonacii(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which fibonacii series need to be generated : ");
        int n = sc.nextInt();
        System.out.println("\n\n");

        for(int i = 0; i <= n; i++){
            System.out.print(fibonacii(i)+" ");
        }

        sc.close();
    }
    
}
