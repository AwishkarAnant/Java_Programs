public class RemoveSpace {
    public static void main(String[] args){
        String str = "Unlimited  Loves  Happiness";

        String result = str.replaceAll("\\s+", "");

        System.out.println(result);
    }
    
}
