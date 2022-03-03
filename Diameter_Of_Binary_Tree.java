package AllCodes;

public class Diameter_Of_Binary_Tree {

	 public int diameterOfBinaryTree(TreeNode root) {
	        if(root==null)
	            return 0;
	        
	        int option1=height(root.left)+height(root.right);
	        int option2=diameterOfBinaryTree(root.left);
	        int option3=diameterOfBinaryTree(root.right);
	        
	        return Math.max(option1,Math.max(option2,option3));
	    }
	    public int height(TreeNode root) {
	        if(root==null)
	            return 0;
	        
	        int ans=1;
	        int lh=height(root.left);
	        int rh=height(root.right);
	         
	        ans+=Math.max(lh,rh);
	        
	        return ans;
	    }
}
