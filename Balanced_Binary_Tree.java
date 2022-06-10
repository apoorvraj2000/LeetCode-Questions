package AllCodes;

public class Balanced_Binary_Tree {
	 public boolean isBalanced(TreeNode root) {
	        if(root==null)
	            return true;
	      
	        int height=findHeight(root);
	        
	        if(height==-1)
	            return false;
	        else
	            return true;
	    }
	    public int findHeight(TreeNode root){
	        if(root==null)
	            return 0;
	        
	        int right=findHeight(root.right);
	        int left=findHeight(root.left);
	        
	        if(right==-1 || left==-1)
	            return -1;
	        
	        if(Math.abs(right-left)>1)
	            return -1;
	        
	        return 1+Math.max(right,left);
	    }
	   
}
