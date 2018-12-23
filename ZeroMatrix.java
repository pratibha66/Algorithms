import java.util.*;

public class ZeroMatrix{
	public static void main(String [] args){
		int[][] matrix = new int[][] {
			{1, 0, 1}, {0,1,1}, {1,1,1}
		};

		zeroMatrix(matrix);
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
		
	}
	
	public static void zeroMatrix(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];

		setMatrix(row);
		setMatrix(column);

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == 0){
					row[i] = 0;
					column[j] = 0;
				}
			}
		}

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = row[i] * column[j];
			}
		}

	}

	private static void setMatrix(int[] mat){
		for(int i = 0; i < mat.length; i++){
			mat[i] = 1;
		}
	}

}