package AllCodes;

public class Search_In_Rotated_Sorted_Array_II {

	public boolean search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        
        while(si<=ei){
            int mid=(ei+si)/2;
            
            if(nums[mid]==target)
                return true;
             /*if this follows then it means that 1st half could 
            be out of order i.e., not in ascending order and 
                if middle and starting elements are equal then 
        it is guaranteed that ending and mid elements are equal. 
                    So ignore them and decrease the search space. */
            if((nums[si]==nums[mid]) && (nums[ei]==nums[mid])){
                si++;
                ei--;
            }
            else if(nums[si]<=nums[mid]){
                //Means left part is sorted
                if((nums[si]<=target) && (target<=nums[mid])){
                    //means target lies in left part and left part is sorted
                    ei=mid-1;
                }else{
                    //means target not lies in left part so search in right
                    si=mid+1;
                }
            }
            else{
                //Means right part is sorted
                if((nums[mid]<=target) && (target<=nums[ei])){
                    //means target lies in right part and right part is sorted
                    si=mid+1;
                }else{
                    //means target not lies in right part so search in left
                    ei=mid-1;
                }
            }
        }
        return false;
    }
}
