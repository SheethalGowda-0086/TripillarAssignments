package recursionAndBacktracking;

public class prgm5 {
    static int N = 4;
    static int[][] maze = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
    };
    static int[][] sol = new int[N][N];
    static boolean solve(int x, int y) {
        if (x == N-1 && y == N-1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (x < N && y < N && maze[x][y] == 1) {
            sol[x][y] = 1;
            if (solve(x+1, y)) return true;
            if (solve(x, y+1)) return true;
            sol[x][y] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        if (solve(0,0)) {
            for (int[] row : sol) {
                for (int val : row) System.out.print(val + " ");
                System.out.println();
            }
        } else System.out.println("No path found");
    }
}
