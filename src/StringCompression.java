public class StringCompression {
    static String compress(String string){
        char newChar = string.charAt(0);
        int charCount = 0;
        StringBuilder compressed = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == newChar){
                charCount++;
            }
            else{
                compressed.append(newChar).append(charCount);
                newChar = string.charAt(i);
                charCount = 1;
            }
        }
        compressed.append(newChar).append(charCount);
        if(string.length()<compressed.length()){
            return string;
        }
        else{
            return compressed.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabccccdddde"));
    }
}
