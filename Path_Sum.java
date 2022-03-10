package AllCodes;

public class Path_Sum {

	public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
               return true;
           }else{
                return false;
            }   
        }
        
        boolean leftAns=hasPathSum(root.left,targetSum-root.val);
        
        boolean rightAns=hasPathSum(root.right,targetSum-root.val);
        
        if(leftAns==true || rightAns==true)
            return true;
        
        return false;
    }
}
