package AllCodes;

import java.util.*;

public class Maximum_Width_of_Binary_Tree {
	class Pair{
        int ind;
        TreeNode node;
        public Pair(TreeNode node,int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=1;
        
        while(!q.isEmpty()){
            Pair curr=q.peek();
            int min=curr.ind;
            int size=q.size();
            int left=0;
            int right=0;
            for(int i=0;i<size;i++){
                int currId=q.peek().ind-min;
                TreeNode node=q.poll().node;
                if(i==0)
                    left=currId;
                if(i==size-1)
                    right=currId;
                if(node.left!=null)
                    q.add(new Pair(node.left,currId*2+1));
                if(node.right!=null)
                    q.add(new Pair(node.right,currId*2+2));
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
