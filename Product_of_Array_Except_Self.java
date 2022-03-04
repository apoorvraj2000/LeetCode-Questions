package AllCodes;

public class Product_of_Array_Except_Self {

		public int[] productExceptSelf(int[] nums) {
	        int ans[]=new int[nums.length];
	        
	        int leftProduct=1;
	        for(int i=0;i<nums.length;i++){
	               leftProduct*=nums[i];
	                ans[i]=leftProduct;
	        }
	        
	        int rightProduct=1;
	        
	        for(int i=nums.length-1;i>0;i--){
	            ans[i]=ans[i-1]*rightProduct;
	            rightProduct*=nums[i];
	        }
	        ans[0]=rightProduct;
	        
	        return ans;
	    }
}
