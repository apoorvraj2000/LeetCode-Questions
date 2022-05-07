package AllCodes;

import java.util.*;

public class Pattern_1_2_2 {
	//O(n^2)
	public boolean find132pattern(int[] nums) {
        if(nums.length<3)
            return false;
        
        int len=nums.length;
        
        for(int j=1;j<len-1;j++){
            
            boolean leftFlag=false;
            int leftMin=Integer.MAX_VALUE;
            
            for(int i=j-1;i>=0;i--){
                if(nums[i]<nums[j]){
                    leftFlag=true;
                    leftMin=Math.min(leftMin,nums[i]);
                }
            }
             boolean rightFlag=false;
            int rightMax=Integer.MIN_VALUE;
            for(int k=j+1;k<len;k++){
                if(nums[k]<nums[j]){
                    rightFlag=true;
                    rightMax=Math.max(nums[k],rightMax);
                }
            }
            
            if(leftFlag && rightFlag && leftMin<rightMax)
                return true;
        }
        
        return false;
    }
	//O(n)
	 public boolean find132patternn(int[] nums) {
         int len = nums.length;
        if (len < 3) {
            return false;
        }

        Deque<Integer> stk = new ArrayDeque<>();
        int k = -1;
        for (int i = len - 1; i >= 0; i--) {
            if (k > -1 && nums[k] > nums[i]) {
                return true;
            }

            while (!stk.isEmpty() && nums[i] > nums[stk.peek()]) {
                k = stk.pop();
            }

            stk.push(i);
        }

        return false;
    }
}
