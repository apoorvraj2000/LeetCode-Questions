package AllCodes;

import java.util.Stack;

class BSTIterator {
    
    Stack<TreeNode>st=new Stack<>();
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    private void inorder(TreeNode root){
        if(root==null)
            return;
        
        inorder(root.right);
        
        st.push(root);
        
        inorder(root.left);
    }
    public int next() {
        TreeNode curr=st.pop();
        return curr.val;
    }
    
    public boolean hasNext() {
        if(st.size()>=1)
            return true;
        
        return false;
    }
}

public class Binary_Search_Tree_Iterator {

}
