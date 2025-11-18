import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] a, int key){
        
        int low = 0;
        int high = a.length-1;

        while (low <= high){
            int mid = (low+high)/2;

            if(a[mid]==key){
                return mid;
            } else if(a[mid]<key){
                low = mid+1;
            } else{
                high = mid -1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args){
        int a[]= {1,3,4,5,2,6};
        Arrays.sort(a);

        int key = 5;
        int result = binarySearch(a,key);

        if(result == -1){
            System.out.println("Element Not Found.");
        } else{
            System.out.println("Element Found at Index : "+result);
        }
        
    
    }
    
}
