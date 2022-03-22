package AllCodes;

public class Deepest_Leaves_Sum {
	 public int deepestLeavesSum(TreeNode root) {
	        if(root==null)
	            return 0;
	        
	        //find the max depth.
	        int depth=maxDepth(root);
	        
	        //Traverse the tree again to compute the sum required at max depth
	        return helper(root,1,depth);
	    }
	    public int helper(TreeNode root,int currDepth,int depth){
	        if(root==null)
	            return 0;
	        
	        if((root.left==null && root.right==null) && currDepth==depth){
	            return root.val;
	        }
	         int right=helper(root.right,currDepth+1,depth);
	        
	          int left=helper(root.left,currDepth+1,depth);
	        
	        return right+left;
	    }
	    public int maxDepth(TreeNode root){
	        if(root==null)
	            return 0;
	        
	        int depth=1;
	        
	        int right=maxDepth(root.right);
	        
	        int left=maxDepth(root.left);
	        
	        depth+=Math.max(right,left);
	            
	        return depth;
	    }
}
