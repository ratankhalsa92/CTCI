
import java.util.*;

public class RotateMatrix {

    public static boolean rotate(int[][] matrix) {
        if(matrix.length ==0  || matrix.length != matrix[0].length)     // If the matrix doesn't exist or it's not a square matrix, exit.
            return false;

        int length = matrix.length;

        for(int layer = 0; layer < length/2; layer++) {
            int first = layer;
            int last = length-1-layer;

            for(int i = first; i < last; i++) {                 // understand this entire loop
                int offset = i - first;

                int top = matrix[first][i];
                matrix[first][i]            = matrix[last-offset][first];
                matrix[last-offset][first]  = matrix[last][last-offset];
                matrix[last][last-offset]   = matrix[i][last];
                matrix[i][last]             = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] array2D = new int[2][2];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array2D.length; i++) {
            for(int j = 0; j < array2D[0].length; j++) {
                array2D[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.println(array2D[i][j]);
            }
            System.out.println();
        }

        System.out.println(rotate(array2D));
    }
}
