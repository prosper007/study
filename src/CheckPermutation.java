import java.util.Arrays;

public class CheckPermutation {
    String sort(String str){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    boolean checkPerm(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        return sort(str1).equals(sort(str2));
    }
}
