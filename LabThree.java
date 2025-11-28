import java.util.ArrayList;
import java.util.List;

public class LabThree 
{
    public static String reverseVowels(String text) 
    {
    String v = "aeiouAEIOU";
    ArrayList<Character> arr = new ArrayList<>();
     for(int i = 0;i<text.length();i++){
        char c = text.charAt(i);
        for(int j = 0;j<v.length();j++){
            if(c == v.charAt(j)){
                arr.add(c);
            }
        }
            
     }
    int index = arr.size() -1;
    StringBuilder sb = new StringBuilder(text);
    for(int k = 0;k<text.length();k++){
        char l = text.charAt(k);
        for(int n = 0;n<v.length();n++){
            if(l == v.charAt(n)){
                char rev = arr.get(index--);
                if(Character.isUpperCase(l)){
                    sb.setCharAt(k,Character.toUpperCase(rev));
                }
                else{
                    sb.setCharAt(k,Character.toLowerCase(rev));
                }
            }
        }
    }
    return sb.toString();
        
        

    }


    
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

