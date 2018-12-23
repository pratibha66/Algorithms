import java.util.*;

public class QuickSort{
	public static void main(String [] args){
		int [] arr = {2,4,5,7,8,1,3,6};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int l, int r){
		if(l >= r){
			return;
		} 
		int pivotVal = arr[r];
		int idx = l-1;

		for(int i = l; i < r ; i++){
			if(arr[i] <= pivotVal){
				idx++;
				swap(arr, idx, i);
			}
		}
		idx++;
		swap(arr, idx, r);
		quickSort(arr, idx+1, r);
		quickSort(arr, l, idx-1);
	}

	public static void quickSort(int[] arr){
		if(arr == null || arr.length < 2){
			return;
		}
		quickSort(arr, 0, arr.length -1);
	}

	private static void swap(int[] arr, int a, int b){
		int temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
}


