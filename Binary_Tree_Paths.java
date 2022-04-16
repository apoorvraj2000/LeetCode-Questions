package AllCodes;

import java.util.*;

public class Binary_Tree_Paths {
	ArrayList<String>ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
        helper(root,"");
        return ans;
    }
    public void helper(TreeNode root, String currAns) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            currAns+=root.val;
            ans.add(currAns);
            return;
        }
        currAns+=root.val+"->";
        helper(root.left,currAns);
        
        helper(root.right,currAns);
        
    }
}
