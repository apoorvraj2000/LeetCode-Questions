package AllCodes;

public class Maximum_Depth_of_Binary_Tree {

	public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        int depth=1;
        
        int lh=maxDepth(root.left);
        
        int rh=maxDepth(root.right);
        
        depth+=Math.max(lh,rh);
        
        return depth;
    }
}
