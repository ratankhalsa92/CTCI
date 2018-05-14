
import java.util.*;

public class ZeroMatrix {

    public static void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0; i< row.length; i++) {
            if(row[i]) {
                for(int j=0; j<matrix[0].length; j++)
                    matrix[i][j] = 0;
            }
        }

        for(int j=0; j< column.length; j++) {
            if(column[j]) {
                for(int i=0; i<matrix.length; i++)
                    matrix[i][j] = 0;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter the Matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        setZeros(arr);
    }
}
