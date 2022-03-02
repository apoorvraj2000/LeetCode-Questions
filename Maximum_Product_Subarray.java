package AllCodes;

public class Maximum_Product_Subarray {

	public int maxProduct(int[] nums) {
        //Final Ans
        int maxPro=Integer.MIN_VALUE;
        //Current Product
        int currPro=1;
        //Checking max Product from first to last index
        for(int i=0;i<nums.length;i++){
            currPro*=nums[i];
            
            maxPro=Math.max(maxPro,currPro);
            
            if(currPro==0)
                currPro=1;
        }
        
        //make current product 1 once again for second traversal
        currPro=1;
        
        //Checking max Product from last to first index
        for(int i=nums.length-1;i>=0;i--){
            currPro*=nums[i];
            
            maxPro=Math.max(maxPro,currPro);
            
            if(currPro==0)
                currPro=1;
        }
        return maxPro;
    }
}
