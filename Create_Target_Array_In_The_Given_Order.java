package AllCodes;

import java.util.ArrayList;

public class Create_Target_Array_In_The_Given_Order {
	  public int[] createTargetArray(int[] nums, int[] index) {
	        ArrayList<Integer>list=new ArrayList<>();
	        
	        for(int i=0;i<nums.length;i++){
	            list.add(index[i],nums[i]);
	        }
	        for(int i=0;i<list.size();i++)
	            nums[i]=list.get(i);
	        
	        return nums;
	    }
}
