package AllCodes;

public class Root_Equals_Sum_Of_Children {

	 public boolean checkTree(TreeNode root) {
	        if(root.val==(root.left.val+root.right.val))
	            return true;
	        
	        return false;
	    }
}
