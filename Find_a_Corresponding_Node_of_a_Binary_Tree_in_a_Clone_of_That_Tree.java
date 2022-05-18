package AllCodes;

public class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {

	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	       if(original==null || original==target){
	           return cloned;
	       } 
	        if(cloned.equals(target)){
	            return cloned;
	        }
	        
	        TreeNode ans1=getTargetCopy(original.left,cloned.left,target);
	        
	        if(ans1!=null){
	            return ans1;
	        }
	        TreeNode ans2=getTargetCopy(original.right,cloned.right,target);
	        return ans2;
	    }
}
