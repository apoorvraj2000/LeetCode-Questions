package AllCodes;

public class Kth_Largest_Element_In_An_Array {

	 public int findKthLargest(int[] nums, int k) {
	        sort(nums,0,nums.length-1);
	        
	        return nums[nums.length-k];
	    }
	   
	    private void sort(int[] nums, int si, int ei) {
			if(si>=ei)
				return;
	        
			int mid=(si+ei)/2;
			sort(nums,si,mid);
			sort(nums,mid+1,ei);
			merg(nums,si,mid,ei);	
		}

		private void merg(int[] arr, int si, int mid, int ei) {
			int temp[]=new int[ei-si+1];
			int i=si;
			int j=mid+1;
			int ind=0;
			
			while(i<=mid && j<=ei) {
				if(arr[i]<=arr[j]) {
					temp[ind]=arr[i];
					i++;
					ind++;
				}else {
					temp[ind]=arr[j];
					j++;
					ind++;
				}
			}
			while(i<=mid) {
				temp[ind]=arr[i];
				i++;
				ind++;
			}
			while(j<=ei) {
				temp[ind]=arr[j];
				j++;
				ind++;
			}
			
			for(int k=0;k<temp.length;k++) {
				arr[si+k]=temp[k];
			}
		}
	
}
