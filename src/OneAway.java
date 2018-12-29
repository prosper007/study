public class OneAway {
    static boolean oneAway(String string1, String string2){
        if(Math.abs(string1.length() - string2.length()) > 1){
            return false;
        }
        if(string1.length() != string2.length()){
            String shorter = string1.length() < string2.length() ? string1 : string2;
            String longer = string1.length() < string2.length() ? string2 : string1;
            int l = 0;
            boolean diff = false;
            for(int s = 0; s < shorter.length(); s++){
                if(shorter.charAt(s) != longer.charAt(l)){
                    if(diff){
                        return false;
                    }
                    s--;
                    diff = true;
                }

                l++;
            }
        }
        if(string1.length() == string2.length()) { //strings are of equal length
            int diffcount = 0;
            for(int i = 0; i < string1.length(); i++){
                if(string1.charAt(i) != string2.charAt(i)){
                    diffcount++;
                }
                if(diffcount > 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("plt", "pale"));
        //System.out.println("bake".contains(String.valueOf("pale".charAt(0))));
    }
}
