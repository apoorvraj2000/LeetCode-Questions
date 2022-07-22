package AllCodes;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
   public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int []nums, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        
        TreeNode node=new TreeNode(nums[mid]);
        
        node.left=helper(nums,si,mid-1);
        
        node.right=helper(nums,mid+1,ei);
        
        return node;
    }
}
