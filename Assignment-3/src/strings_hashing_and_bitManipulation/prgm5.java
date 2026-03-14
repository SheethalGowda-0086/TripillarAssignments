package strings_hashing_and_bitManipulation;

public class prgm5 {
    public static void main(String[] args) {
        int num = 13; // binary 1101
        System.out.println("Number of set bits in " + num + " is " + countSetBits(num));
    }
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }
}
