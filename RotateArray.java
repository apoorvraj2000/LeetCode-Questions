package AllCodes;

public class RotateArray {

	 public void rotate(int[] nums, int k) {
	        int len=nums.length;
	        
	        k=k%len;
	        //Reverse 0 to last
	        reverse(nums,0,len-1);
	        //Reverse 0 to k-1
	        reverse(nums,0,k-1);
	        //Reverse k to last
	        reverse(nums,k,len-1);
	        
	    }
	    public void reverse(int arr[], int si, int ei){
	        while(si<ei){
	            int temp=arr[ei];
	            arr[ei]=arr[si];
	            arr[si]=temp;
	            si++;
	            ei--;
	        }
	    }
}
