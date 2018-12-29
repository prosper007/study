public class URLify {
    static String urlify(String str, int truelen){
        char[] chars = str.toCharArray();
        int end = str.length() -1;
        char swap;
        for(int i = truelen-1; i >= 0; i--){
            if(chars[i] == ' '){
                chars[end] = '0';
                chars[end-1] = '2';
                chars[end-2] = '%';
                end = end -3;
            }
            else{
                swap = chars[end];
               chars[end] = chars[i];
               chars[i] = swap;
               end--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(urlify("   ",  1));
    }
}

