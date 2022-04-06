package AllCodes;

import java.util.*;

public class Increasing_Order_Search_Tree {
	public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return root;
        Stack<Integer>st=new Stack<>();
        getSt(root,st);
        
        TreeNode ans=new TreeNode(0);
        TreeNode curr=ans;
        while(!st.isEmpty()){
            curr.right=new TreeNode(st.pop());
            curr=curr.right;
        }
        
        return ans.right;
    }
    public void getSt(TreeNode root,Stack<Integer> st){
        if(root==null)
            return;
        
        getSt(root.right,st);
        
        st.push(root.val);
        
        getSt(root.left,st);       
    
    }
}
