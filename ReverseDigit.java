public class ReverseDigit {
    //Write a function to reverse the digits of an integer.
    public static int digitRev(int n){
        int rev = 0;

        while (n > 1){
            rev = n%10+ rev *10;
            n=n/10;
        }

        return rev;

    }

    public static void main(String[] args){
        int n = 234;

        System.out.println("Number : "+n+"\nReverse : "+digitRev(n));
    }
}
