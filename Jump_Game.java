package AllCodes;

public class Jump_Game {

	public boolean canJump(int[] nums) {
        int maxReachable=0;
        
        for(int i=0;i<nums.length;i++){
            if(maxReachable==nums.length-1)
                return true;
            if(i>maxReachable)
                return false;
            if(i+nums[i]>maxReachable)
                maxReachable=i+nums[i];
        }
        return true;
    }
}
