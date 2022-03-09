package AllCodes;

public class Validate_Binary_Search_Tree {

	 public boolean isValidBST(TreeNode root) {
	        if(root==null){
	            return true;
	        }
	        long leftMax=max(root.left);
	        long rightMin=min(root.right);
	        
	        if(root.val<=leftMax){
	            return false;
	        }
	        if(root.val>=rightMin){
	            return false;
	        }
	        
	        boolean leftAns=isValidBST(root.left);
	        boolean rightAns=isValidBST(root.right);
	        
	        if(leftAns && rightAns){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
	    public long max(TreeNode root){
	        if(root==null){
	            return Long.MIN_VALUE;
	        }
	        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
	    }
	    public long min(TreeNode root){
	        if(root==null){
	            return Long.MAX_VALUE;
	        }
	        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
	    }
}
