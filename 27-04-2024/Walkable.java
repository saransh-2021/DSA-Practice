/*
apply this using recursion
inputs are matrix , start_point, num_to_change and num_from_change
only moves allowed are left, right, up and down
input : [[8,8,8],[8,8,0],[8,0,8]], (1,1), 8, 9
output: [[9,9,9],[9,9,0],[9,0,8]]
*/

public class Walkable {
    public static void main(String[] args) {
        int[][] matrix = {{8,8,8},{8,8,0},{8,0,8}};
        int[] start_point = {2,2};
        int num_to_change = 8;
        int num_from_change = 9;
        int[][] result = walk(matrix, start_point, num_to_change, num_from_change);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] walk(int[][] matrix, int[] start_point, int num_to_change, int num_from_change) {
        int x = start_point[0];
        int y = start_point[1];
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return matrix;
        }
        if (matrix[x][y] == num_to_change) {
            matrix[x][y] = num_from_change;
            walk(matrix, new int[]{x - 1, y}, num_to_change, num_from_change);
            walk(matrix, new int[]{x + 1, y}, num_to_change, num_from_change);
            walk(matrix, new int[]{x, y - 1}, num_to_change, num_from_change);
            walk(matrix, new int[]{x, y + 1}, num_to_change, num_from_change);
        }
        return matrix;
    }
}