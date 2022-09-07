package AllCodes;

public class Construct_String_From_Binary_Tree {
	 String ans="";
	    public String tree2str(TreeNode root) {
	        if(root==null)
	            return ans;
	        helper(root);
	        return ans;
	    }
	    public void helper(TreeNode root){
	        if(root.left==null && root.right==null){
	            ans+=root.val;
	            return;
	        }
	        
	        ans+=root.val;
	        if(root.left!=null){
	            ans+="(";
	            helper(root.left);
	            ans+=")";
	        }
	        if(root.left==null && root.right!=null){
	            ans+="()";
	        }
	        if(root.right!=null){
	             ans+="(";
	            helper(root.right);
	            ans+=")";
	        }
	    }
}
