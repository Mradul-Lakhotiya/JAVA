import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    // up, right, down, left
    static String direction = "DLRU";
    static int[] dc = new int[] {0, -1, 1, 0};
    static int[] dr = new int[] {1, 0, 0 ,-1};


    static boolean isValid (int row, int col, int[][] maze, int n) {
        return (row >= 0 && col >= 0 && row < n && col < n && maze[row][col] == 1);
    }

    static void findPath(int row, int col, int[][] maze, int n, ArrayList<String> ans, StringBuilder currentPath) {
        if (row == n -1 && col == n - 1) {
            ans.add(currentPath.toString());
            return;
        }
        
        maze[row][col] = 0;     // blocking the path we came from

        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            if (isValid(newRow, newCol, maze, n)) {
                // Adding the Path we chose to Come here 
                currentPath.append(direction.charAt(i));

                findPath(newRow, newCol, maze, n, ans, currentPath);

                // BackTracking
                currentPath.deleteCharAt(currentPath.length() - 1);
            }
        }

        maze[row][col] = 1;     // unblocking the path
    }

    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 1, 1, 0, 0 },
                        { 0, 1, 1, 1 } };

        int n = maze.length;
        // List to store all the valid paths
        ArrayList<String> result = new ArrayList<>();
        // Store current path
        StringBuilder currentPath = new StringBuilder();

        if (maze[0][0] != 0 && maze[n - 1][n - 1] != 0) {
            // Function call to get all valid paths
            findPath(0, 0, maze, n, result, currentPath);
        }

        if (result.size() == 0)
            System.out.println(-1);
        else
            for (String path : result)
                System.out.print(path + " ");
        System.out.println();
    }
}
