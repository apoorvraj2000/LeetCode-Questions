package AllCodes;

public class Cousins_In_Binary_Tree {

	public boolean isCousins(TreeNode root, int x, int y) {
        int h1=height(root,x,1);
        int h2=height(root,y,1);
        
        boolean sameParent=!sameParent(root,x,y);
        
        return sameParent && h1==h2;
    }
    public boolean sameParent(TreeNode root, int x, int y){
        if(root==null)
            return false;
        
        if(root.left!=null && root.right!=null){
            if((root.left.val==x && root.right.val==y)||(root.left.val==y && root.right.val==x))
                return true;
        }
        boolean left=sameParent(root.left,x,y);
        
        boolean right=sameParent(root.right,x,y);
        
        return left || right;
    }
    public int height(TreeNode root, int data, int size){
        if(root==null)
            return 0;
        
        if(root.val==data)
            return size;
        
        int left=height(root.left,data,size+1);
        
        int right=height(root.right,data,size+1);
        
        return Math.max(left,right);
    }
}
