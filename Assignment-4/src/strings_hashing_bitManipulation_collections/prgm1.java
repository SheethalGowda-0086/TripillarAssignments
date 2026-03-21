package strings_hashing_bitManipulation_collections;

public class prgm1 {
    public static void main(String[] args) {
        String str = "bacterious";
        int v_count = 0;
        int c_count = 0;
        for (int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e'||ch=='i'||ch=='o'||ch=='u') {
                v_count++;
            } else {
                c_count++;
            }
        }
        System.out.println("vowels: "+v_count+" "+"consonants: "+c_count);
    }
}
