import java.util.*;

public class MoveAll{
	public static void main(String [] args){
	int[] nums = {0,1,0,3,12};
	moveAll(nums);
	System.out.println(Arrays.toString(nums));

	}

	public static void moveAll(int[] nums){
		if(nums == null){
			return;
		}
		int piviot = -1;
		for( int i = 0; i < nums.length ; i++){
			if(nums[i] != 0){
				piviot++;
				nums[piviot] = nums[i];
				nums[i] = 0;
			}

		}

	}

}