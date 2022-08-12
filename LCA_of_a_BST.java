package AllCodes;

public class LCA_of_a_BST {
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val < root.val && q.val < root.val){
        return lowestCommonAncestor(root.left,p,q);
      }
	    else if(p.val > root.val && q.val > root.val){
        return lowestCommonAncestor(root.right, p, q);
      }
	else{
        return root;
      }
        
    }
}
