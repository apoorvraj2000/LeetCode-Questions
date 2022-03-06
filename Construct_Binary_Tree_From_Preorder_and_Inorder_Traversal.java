package AllCodes;

public class Construct_Binary_Tree_From_Preorder_and_Inorder_Traversal {
	 public TreeNode buildTree(int[] preOrder, int[] inOrder) {
	        return buildTreeResult(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	    }
	    public TreeNode buildTreeResult(int[] preOrder, int[] inOrder,int preS,int preE, int inS, int inE) {
	        if(preS>preE || inS>inE)
	            return null;
	        
	        TreeNode root=new TreeNode(preOrder[preS]);
	        
	        int rootIndex=-1;
	        for(int i=inS;i<=inE;i++){
	            if(root.val==inOrder[i]){
	                rootIndex=i;
	                break;
	            }
	        }
	        
	        int leftInS=inS;
	        int leftInE=rootIndex-1;
	        int rightInS=rootIndex+1;
	        int rightInE=inE;
	        
	        int leftPreS=preS+1;
	        int leftPreE=leftInE-leftInS+leftPreS;
	        int rightPreS=leftPreE+1;
	        int rightPreE=preE;
	        
	        TreeNode leftPart=buildTreeResult(preOrder,inOrder,leftPreS,leftPreE,leftInS,leftInE);
	        
	        TreeNode rightPart=buildTreeResult(preOrder,inOrder,rightPreS,rightPreE,rightInS,rightInE);
	        
	        root.left=leftPart;
	        root.right=rightPart;
	        
	        return root;
	        
	    }
}
