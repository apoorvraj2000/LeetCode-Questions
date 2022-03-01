package AllCodes;

public class Search_in_Rotated_Sorted_Array {

	public int search(int[] nums, int target) {
        int pivot=0;
        int i=0;
        while(i<nums.length-1 && nums[i]<nums[i+1]){
            pivot++;
            i++;
        }
        
        int ans=binarySearch(nums,target,0,pivot);
        if(ans!=-1){
            return ans;
        }
        ans=binarySearch(nums,target,pivot+1,nums.length-1);
        return ans;
        
    }
    public int binarySearch(int arr[],int target,int si,int ei){
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return -1;
    }
	
}
