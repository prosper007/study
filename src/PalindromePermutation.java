import java.util.Arrays;

public class PalindromePermutation {
    static boolean palinpermu(String str){
        int[] tally = new int[128];
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                tally[str.charAt(i)]++;
            }
        }
        System.out.println(Arrays.toString(tally));
        int oddCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(tally[str.charAt(i)] % 2 != 0){
                oddCount++;
            }
            if(oddCount > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palinpermu("Tact Coao"));
    }
}
