package AllCodes;

public class Count_Good_Nodes_In_Binary_Tree {
	 public int goodNodes(TreeNode root) {
	        int count[]={0};
	        int max=root.val;
	        helper(root,count,max);
	        
	        return count[0];
	    }
	    
	    public void helper(TreeNode root, int count[], int max){
	        if(root==null)
	            return;
	        
	        if(root.val>=max){
	            count[0]++;
	            max=root.val;
	        }
	        
	        helper(root.left,count,max);
	        
	        helper(root.right,count,max);
	        
	    }
}
