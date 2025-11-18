public class Fibonacii {
    public static void main(String[] args){
        int a = 0, b = 1, temp;

        System.out.println("Fibonacii Series...");
        System.out.print(a + " "+b+ " ");
        for(int i = 0; i <= 10; i++){
            temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
    
}
