package AllCodes;

public class Max_Consecutive_Ones {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i:nums){
            if(i==1){
                count++;
            }else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
