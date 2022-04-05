package AllCodes;

public class Flatten_Binary_Tree_To_Linked_List {
	TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        
        flatten(root.right);
        flatten(root.left);
        
        root.right=prev;
        root.left=null;
        prev=root;
    }
}
