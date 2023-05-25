import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int matrix[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    matrix[i][j] = sc.nextInt();
            }

            ArrayList<Integer> ans = spirallyTraverse(matrix, r, c);
            for (Integer val : ans)
                System.out.print(val + " ");
            System.out.println();
            sc.close();
        }
    }

    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            for (int j = startrow; j <= endrow; j++) {
                result.add(matrix[startrow][j]);
            } // top wall

            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            } // right wall

            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow)
                    break;
                result.add(matrix[endrow][i]);
            } // bottom wall

            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol)
                    break;
                result.add(matrix[i][startcol]);
            } // left wall
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        return result;
    }
}
