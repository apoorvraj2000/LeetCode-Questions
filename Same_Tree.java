package AllCodes;

public class Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        
        if((p!=null && q==null)||(p==null && q!=null)||p.val!=q.val )
            return false;
        
        boolean leftAns=isSameTree(p.left,q.left);
        
        boolean rightAns=isSameTree(p.right,q.right);
        
        return leftAns && rightAns;
    }
}
