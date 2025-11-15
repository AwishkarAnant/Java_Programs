import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "Anant";

        System.out.println("String : "+str+"\nReverse : "+reverse(str));

        sc.close();

    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return sb.toString();
    }
    
}
