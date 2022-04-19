package AllCodes;

public class Recover_Binary_Search_Tree {
	  private TreeNode first;
	    private TreeNode prev;
	    private TreeNode middle;
	    private TreeNode last;
	    //We will do the inorder traversal because it gives us sorted BST
	    public void inorder(TreeNode root){
	        if(root==null)
	            return;
	        
	        inorder(root.left);
	        
	        if(prev!=null && (root.val<prev.val)){
	            //if this is first voilation mark these nodes as first and middle
	            if(first==null){
	                first=prev;
	                middle=root;
	            }else{
	                //if this is second voilation mark this as last
	                last=root;
	            }
	        }
	        //mark current node as previous
	        prev=root;
	        
	         inorder(root.right);
	    }
	    public void recoverTree(TreeNode root) {
	        first=middle=last=null;
	        prev=new TreeNode(Integer.MIN_VALUE);
	        inorder(root);
	        
	        if(first!=null && last!=null){
	            int temp=first.val;
	            first.val=last.val;
	            last.val=temp;
	        }
	        else if(first!=null && middle!=null){
	            int temp=first.val;
	            first.val=middle.val;
	            middle.val=temp;
	        }
	    }
}
