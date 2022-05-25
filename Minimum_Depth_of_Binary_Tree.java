package AllCodes;

public class Minimum_Depth_of_Binary_Tree {

	 public int minDepth(TreeNode root) {
         if(root==null)
             return 0;
     
         
         int leftAns=minDepth(root.left);
     
         int rightAns=minDepth(root.right);
     
          if(leftAns==0 || rightAns==0)
             return 1+leftAns+rightAns;
     
         return 1+Math.min(leftAns,rightAns);
 }
}
