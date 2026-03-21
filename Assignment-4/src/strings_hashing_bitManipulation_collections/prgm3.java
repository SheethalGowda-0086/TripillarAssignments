package strings_hashing_bitManipulation_collections;

public class prgm3 {
    public static void main(String[] args) {
        String str = "Data structures and algos in JAVA";
        String[] word = str.split(" ");
        String longestWord = "";
        for (String w : word) {
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
