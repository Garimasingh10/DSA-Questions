
import java.util.ArrayList;

public class ratinmaze {
 public static boolean issafe(int i, int j, int n, int[][] maze) {
        return i >= 0 && i < n && j >= 0 && j < n && maze[i][j] != 0;
    }

     public static void solve(int i, int j, int n, int[][] maze, String path, ArrayList<String> res) {
        if (i == n - 1 && j == n - 1) {   // reached destination
            res.add(path);
            return;
        }

        maze[i][j] = 0;

        if (issafe(i + 1, j, n, maze)) {
            solve(i + 1, j, n, maze, path + "D", res);
        }
        // Left
        if (issafe(i, j - 1, n, maze)) {
            solve(i, j - 1, n, maze, path + "L", res);
        }
        // Right
        if (issafe(i, j + 1, n, maze)) {
            solve(i, j + 1, n, maze, path + "R", res);
        }
        // Up
        if (issafe(i - 1, j, n, maze)) {
            solve(i - 1, j, n, maze, path + "U", res);
        }
        maze[i][j] = 1;




    }

    static  ArrayList<String> findPath(int[][] maze){
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;
        if(maze[0][0] == 0) return res;
        solve(0,0,n,maze,"",res);
        return res;

    }
    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        ArrayList<String> res = findPath(maze);
        System.out.println(res);    

    }
    
}
