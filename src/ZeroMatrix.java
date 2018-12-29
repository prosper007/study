import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {
    static int[][] zeroMatrix(int[][] matrix){
        boolean rowHasZero = false;
        ArrayList<Integer> zeroColumns = new ArrayList<>();
        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    rowHasZero = true;
                    zeroColumns.add(j);
                }
            }
            if(rowHasZero){
                Arrays.fill(matrix[i], 0);
                rowHasZero = false;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<zeroColumns.size(); j++){
                matrix[i][zeroColumns.get(j)] = 0;
            }
        }
        return matrix;
    }

    static void print(int[][] matrix){
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = i*10+j;
            }
        }
        matrix[0][2] = 0;
        print(matrix);
        print(zeroMatrix(matrix));


    }
}
