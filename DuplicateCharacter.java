import java.util.HashMap;

public class DuplicateCharacter {
    //Write a program to print duplicate characters in a given string.

    public static void main(String[] args){
        String str = "Anant";
        char[] ch = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : ch){
            if(c != ' '){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        System.out.println("Duplicate Characters in the String.");
        for(char c : map.keySet()){
            System.out.println(c+" -> "+map.get(c)+" times.");
        }
    }
    
    
}
