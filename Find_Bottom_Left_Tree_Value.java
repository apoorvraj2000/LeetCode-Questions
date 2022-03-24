package AllCodes;

public class Find_Bottom_Left_Tree_Value {

	public int ans=0,maxDepth=0;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null)
            return root.val;
        
        helper(root,0);
        
        return ans;
    }
     public void helper(TreeNode root,int currD) {
        if(root==null)
            return;
         
          if(currD>maxDepth){
             maxDepth=currD;
             ans=root.val;
         }
         helper(root.left,currD+1);
         
         helper(root.right,currD+1);   
    }
}
