package AllCodes;
import java.util.*;
public class Binary_Tree_Inorder_Traversal {

	 List<Integer>ans=new LinkedList<>();
	    public List<Integer> inorderTraversal(TreeNode root) {
	        if(root==null){
	            return new LinkedList<Integer>();
	        }
	        inorderTraversal(root.left);
	        ans.add(root.val);
	        inorderTraversal(root.right);
	        
	        return ans;        
	    }
	
}
