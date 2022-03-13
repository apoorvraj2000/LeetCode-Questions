package AllCodes;
import java.util.*;
public class Sum_Root_To_Leaf_Numbers {

	/*
	 * Brute-force
	List<Integer>store=new LinkedList<>();
    public int sumNumbers(TreeNode root) {
        sumNumbers(root,"");
        int ans=0;
        for(int i=0;i<store.size();i++){
            ans+=store.get(i);
        }
        return ans;
    }
    public void sumNumbers(TreeNode root,String outputSoFar) {
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            outputSoFar+=root.val;
            store.add(Integer.parseInt(outputSoFar));
            return;
        }
        outputSoFar+=root.val;
        sumNumbers(root.left,outputSoFar);
        sumNumbers(root.right,outputSoFar);
    }
    */
	
	//OPTIMIZE
	public int sumNumbers(TreeNode root) {
	      return sumNumbersHelper(root,0);  
	    }
	    public int sumNumbersHelper(TreeNode root,int currSum) {
	        // Base case
	        if(root==null)
	            return 0;
	        
	        // Update currSum
	        currSum=(currSum*10)+root.val;
	        // if current node is leaf, return currSum
	        if(root.left==null && root.right==null){
	            return currSum;
	        }
	        //Call on left
	        int leftOp=sumNumbersHelper(root.left,currSum);
	        //Call on right
	        int rightOp=sumNumbersHelper(root.right,currSum);
	        
	        return leftOp+rightOp;
	    }

}
