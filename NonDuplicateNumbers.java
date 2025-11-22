import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonDuplicateNumbers {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,2,3,3,3,4,5,5,5,5,5);

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int a : arr){
            countMap.put(a,countMap.getOrDefault(a, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            int number = entry.getKey();
            int count = entry.getValue();

            if(count > 1){
                System.out.println("Duplicate value: " + number);
            } else {
                System.out.println("Non Duplicate value: " + number);
            }
        }
        
    }
    
}
