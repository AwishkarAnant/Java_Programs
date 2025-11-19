public class Vowel {
    public static void main(String[] args){
        String str = "The character A is a vowel.";

        for(char ch : str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                System.out.print(ch);
            }
        }
    }
    
}
