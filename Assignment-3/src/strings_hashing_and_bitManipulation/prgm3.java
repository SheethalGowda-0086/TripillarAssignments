package strings_hashing_and_bitManipulation;

public class prgm3 {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Without duplicates: " + removeDuplicates(str));
    }
    public static String removeDuplicates(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(result.indexOf(c) == -1){
                result += c;
            }
        }
        return result;
    }
}

