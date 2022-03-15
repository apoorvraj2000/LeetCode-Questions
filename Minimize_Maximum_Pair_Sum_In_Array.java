package AllCodes;

import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_In_Array {

	public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int si=0;
        int ei=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(si<ei){
            int currMax=nums[si]+nums[ei];
            max=Math.max(max,currMax);
            si++;
            ei--;
        }
        return max;
    }
}
