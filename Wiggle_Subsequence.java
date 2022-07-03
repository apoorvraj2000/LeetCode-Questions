package AllCodes;

public class Wiggle_Subsequence {
	 public int wiggleMaxLength(int[] nums) {
	        int n=nums.length;
	        
	        if(n==1)
	            return 1;
	        
	        int count=0;
	        int preDiff=nums[1]-nums[0];
	        
	        if(preDiff==0){
	            count=1;
	        }else{
	            count=2;
	        }
	        
	        for(int i=2;i<n;i++){
	            int currDiff=nums[i]-nums[i-1];
	            
	            if((currDiff<0 && preDiff>=0) || (currDiff>0 && preDiff<=0)){
	                count++;
	                preDiff=currDiff;
	            }
	        }
	        return count;
	    }
}
