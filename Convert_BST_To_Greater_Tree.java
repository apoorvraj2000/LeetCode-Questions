package AllCodes;

public class Convert_BST_To_Greater_Tree {
	public TreeNode convertBST(TreeNode root) {
        helper(root,0);
        return root;
    }
    public int helper(TreeNode root,int currSum){
        if(root==null)
            return currSum;
        
        int rightSum=helper(root.right,currSum);
        rightSum+=root.val;
        root.val=rightSum;
        
        int leftSum=helper(root.left,rightSum);
        
        return leftSum;
    }
}
