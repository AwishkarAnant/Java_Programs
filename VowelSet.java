import java.util.HashSet;
import java.util.Set;

public class VowelSet {
    public static void main(String[] args){
        Set<Character> vowel = Set.of('a','e','i','o','u');

        String str = "The character A is a vowel.";

        Set<Character> found = new HashSet<>();

        for(char ch : str.toLowerCase().toCharArray()){
            if(vowel.contains(ch)){
                found.add(ch);
            }
        }

        for(char c : found){
            System.out.print(c);
        }

        System.out.println("\nNumber of Distinct vowels : "+ found.size());
        
    }
    
}
