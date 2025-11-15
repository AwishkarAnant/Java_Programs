import java.util.Scanner;

public class ReverseStr {
    public static String reverse(String str){
        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        return rev;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input string : ");
        String str = sc.nextLine();

        System.out.println("String : "+str+"\nReverse : "+reverse(str));

        sc.close();

    }
}
