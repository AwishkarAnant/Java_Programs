public class ReverseStringWord{
    public static void main(String[] args){
        String statement = "I Love Akanksha";
        System.out.println(statement);
        String[] str = statement.split(" ");
        String rev = "";

        for(int i = str.length-1; i <= 0; i--){
            rev = rev + str[i];
        }

        System.out.println(rev);

    }
}