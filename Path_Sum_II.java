package AllCodes;

import java.util.*;

public class Path_Sum_II {
	
	List<List<Integer>>ans=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<Integer>outputSoFar=new LinkedList<>();
        
        pathSumAns(root, targetSum, outputSoFar);
        
        return ans;
    }
    public void pathSumAns(TreeNode root, int targetSum, List<Integer>outputSoFar) {
         if(root==null){
             return;
         }
            
        outputSoFar.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum){
            ans.add(outputSoFar);
        }else{
            pathSumAns(root.left,targetSum-root.val,new ArrayList<>(outputSoFar));
        
             pathSumAns(root.right,targetSum-root.val,new ArrayList<>(outputSoFar));
        }
         
    }
}
