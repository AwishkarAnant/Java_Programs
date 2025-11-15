public class MinMaxArray {
    //Given an integer array a[] = {23,56,34,78,45,82,30}, find the maximum and minimum values in the array.

    public static void main(String[] args){
        int a[] = {23,56,34,78,45,82,30};
        int max = a[0];
        int min = a[0];
        int n = a.length;

        for(int i = 1; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }

            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("max : "+ max);
        System.out.println("min :  "+ min);

    }

}
