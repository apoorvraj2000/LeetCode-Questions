package AllCodes;
import java.util.*;
public class Binary_Tree_Right_Side_View {
	 public List<Integer> rightSideView(TreeNode root) {
	        if(root==null)
	            return new LinkedList<Integer>();
	        
	         List<Integer>ans=new LinkedList<>();
	          
	            rightSideViewHelper(root,0,ans);
	        return ans;
	    }
	     public void rightSideViewHelper(TreeNode root,int level,List<Integer> ans){
	         if(root==null)
	             return;
	         
	         if(level==ans.size())
	         ans.add(root.val);
	         
	         rightSideViewHelper(root.right,level+1,ans);
	         
	         rightSideViewHelper(root.left,level+1,ans);
	     }
}
