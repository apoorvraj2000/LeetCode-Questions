package AllCodes;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        //if length of array is 0
        if(nums.length==0){
            return ans;
        }
        int firstIndex=getFirst(nums,target,0,nums.length-1);
        
        //if first index is -1 So target is not present in array
        //So return ans
        if(firstIndex==-1){
            return ans;
        }
        int lastIndex=getLast(nums,target,firstIndex,nums.length-1);
        
        ans[0]=firstIndex;
        ans[1]=lastIndex;
        
        return ans;
        
        
    }
    //to find first index
    public int getFirst(int arr[],int target,int si,int ei){
        int ans=-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==target){
                ans=mid;
                //scan the left side for further searching
                ei=mid-1;
            }
            else if(target<arr[mid]){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
    //to find last index
    public int getLast(int arr[],int target,int si,int ei){
        int ans=-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==target){
                ans=mid;
                //scan the Right side for further Searching
                si=mid+1;
            }
            else if(target<arr[mid]){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
	
}
