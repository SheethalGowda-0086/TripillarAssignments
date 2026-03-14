package recursion_And_Backtracking;

import java.util.ArrayList;

public class prgm4 {
    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        ArrayList<Integer> subset = new ArrayList<>();
        System.out.println("All subsets:");
        generateSubsets(set, 0, subset);
    }
    public static void generateSubsets(int[] set, int index, ArrayList<Integer> subset) {
        if(index == set.length) {
            System.out.println(subset);
            return;
        }
            // Include current element
        subset.add(set[index]);
        generateSubsets(set, index + 1, subset);
            // Exclude current element
        subset.remove(subset.size() - 1);
        generateSubsets(set, index + 1, subset);
    }
}
