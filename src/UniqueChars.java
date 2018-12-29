import java.util.ArrayList;

public class UniqueChars {
    public static boolean hasUniqueChars(String word){
        word = word.toLowerCase();
        ArrayList<Character> encountered = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(encountered.contains(c)){
                return false;
            }
            else{
                encountered.add(c);
            }
        }
        return true;
    }
    public static boolean hasUniqueNoDataStruct(String word){
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            for(int j = i+1; j < word.length(); j++){
                if(c == word.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueNoDataStruct("Obio"));
    }
}
