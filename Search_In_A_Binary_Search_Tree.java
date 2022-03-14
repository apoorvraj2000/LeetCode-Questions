package AllCodes;

public class Search_In_A_Binary_Search_Tree {

	public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        
        if(root.val==val)
            return root;
        
        TreeNode ans;
        if(root.val>val){
            ans=searchBST(root.left,val);
        }else{
           ans= searchBST(root.right,val);
        }
        return ans;
    }
}
