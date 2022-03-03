package AllCodes;

public class Invert_Binary_Tree {

	public TreeNode invertTree(TreeNode root) {
        //Base Case
        if(root==null)
            return null;
        
        //Recursive Call on left
        TreeNode left=invertTree(root.left);
        
        //Recursive Call on right
        TreeNode right=invertTree(root.right);
        
        //Swap left and right node
        root.left=right;
        root.right=left;
        
        //return root
        return root;
    }
}
