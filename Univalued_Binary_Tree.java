package AllCodes;

public class Univalued_Binary_Tree {
	public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return true;
        if(root.left!=null){
            if(root.val!=root.left.val)
                return false;
        }
        if(root.right!=null){
            if(root.val!=root.right.val)
                return false;
        }
        boolean leftAns=isUnivalTree(root.left);
        
        boolean rightAns=isUnivalTree(root.right);
        
        return leftAns && rightAns;
    }
}
