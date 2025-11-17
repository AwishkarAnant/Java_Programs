public class UpperCase_LowerCase {
    //anant -> AnAnT
    public static void main(String[] args){
        String str = "anant";
        String result = "";

        char ch[] = str.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(i%2==0){
                result = result + Character.toUpperCase(ch[i]);
            }else{
                result = result + Character.toLowerCase(ch[i]);
            }
        }

        System.out.println("String : "+str+" Result : "+result);
    }
    
}
