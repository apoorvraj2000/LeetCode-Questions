package AllCodes;

public class Next_Permutation {

	public void nextPermutation(int[] nums) {
        
	       if(nums == null || nums.length <= 1)
	            return;
	        
	        //Start traversing the array backward's from len-2 index and find 
	        //index of such an element whose value is smaller than it's right digit. 
	        //Let's call this index as left.
	        int len = nums.length;
	        int left = len - 2;
	        
	        while(left >= 0 && nums[left] >= nums[left+1]){
	            left--;
	        }
	            
	        // If the left= -1(Array is already sorted) then reverse it. 
	        // this is an edge case.
	        
	        
	        if(left >= 0){
	            int right = len - 1;
	            
	            //Else again traverse the array backwords and find the index(right) 
	            //of an element which is greater then element at left index.
	            while(right >= 0 && nums[left] >= nums[right])
	                right--;
	            //Swap the elements at left and right index positions.
	            swap(nums, left, right);
	        }
	        //Finally reverse the array from left + 1 index to the end.
	        reverse(nums, left+1);
	        
	    }
	     public void swap(int[] nums, int a, int b) {
	        int temp = nums[a];
	        nums[a] = nums[b];
	        nums[b] = temp;
	    }

	    public void reverse(int[] nums, int low) {
	        int left = low;
	        int right = nums.length - 1;
	        while (left < right) {
	            swap(nums, left, right);
	            left++;
	            right--;
	        }
	    }
}
