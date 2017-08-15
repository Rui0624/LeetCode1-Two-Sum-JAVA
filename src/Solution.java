
public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int [] sumArray = new int[2];
		int l = nums.length;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length; j++){
				if(i == j){
					continue;
				}else{
					int sum = nums[i] + nums[j];
					if(sum == target){
						sumArray[0] = i;
						sumArray[1] = j;
						return sumArray;
					}
				}
			}
            
		}
		
		
        return sumArray;
    }
  
}

