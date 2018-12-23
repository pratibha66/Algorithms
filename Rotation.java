// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15 
// 16 17 18 19 20 
// 21 22 23 24 25 

// fl -> 0 ll -> arr.lenght - 1

// fl < ll:
//  i = 0;
//  int temp = arr[fl][fl+i]
import java.util.*;

public class Rotation{
	
	public static void main(String [] args){
		int[][] matrix = new int[][] { {1, 2, 3, 4, 5}, 
									   {6, 7, 8, 9, 10},
									   {11, 12, 13, 14, 15},
									   {16, 17, 18, 19, 20},
									   {21, 22, 23, 24, 25}
									   };
		rotation(matrix);
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

	public static void rotation(int[][] matrix){

		int firstLayer = 0;
		int lastLayer = matrix.length -1;


		while(firstLayer < lastLayer){
			int j = 0;
			for(int i = firstLayer; i < lastLayer; i++){
				int temp = matrix[firstLayer][firstLayer+j];
				matrix[firstLayer][firstLayer+j] = matrix[lastLayer-j][firstLayer];
				matrix[lastLayer-j][firstLayer] = matrix[lastLayer][lastLayer-j];
				matrix[lastLayer][lastLayer-j] = matrix[firstLayer+j][lastLayer];
				matrix[firstLayer+j][lastLayer] = temp;
				j++;
			}
			firstLayer++;
			lastLayer--;
		}
	}
}