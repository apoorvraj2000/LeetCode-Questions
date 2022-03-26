package AllCodes;

public class Kth_Smallest_Element_in_a_BST {

	 int count=0;
	    public int kthSmallest(TreeNode root, int k) {
	        if(root==null)
	            return 0;
	        
	        int left=kthSmallest(root.left,k);
	        count++;
	        
	        if(left!=0)
	            return left;
	        
	        if(count==k){
	            return root.val;
	        }
	        
	        return kthSmallest(root.right,k);
	        
	    }
}
