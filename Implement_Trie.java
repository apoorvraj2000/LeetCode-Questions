package AllCodes;
class TrieNode{
    char data;
    TrieNode children[];
    boolean isTerminating;
    public TrieNode(char data){
        this.data=data;
        children=new TrieNode[26];
        isTerminating=false;
    }
}
public class Implement_Trie {
	 private TrieNode root;
	    public Implement_Trie() {
	        root=new TrieNode('\0');
	    }
	    
	    public void insert(String word) {
	        insertHelper(root,word);
	    }
	    private void insertHelper(TrieNode root,String word){
	        if(word.length()==0){
	            root.isTerminating=true;
	            return;
	        }
	        int childIndex=word.charAt(0)-'a';
	        TrieNode child=root.children[childIndex];
	        if(child==null){
	            child=new TrieNode(word.charAt(0));
	            root.children[childIndex]=child;
	        }
	        insertHelper(child,word.substring(1));
	    }
	    
	    public boolean search(String word) {
	        return searchHelper(root,word);
	    }
	    private boolean searchHelper(TrieNode root,String word){
	        if(word.length()==0){
	            return root.isTerminating;
	        }
	        int childIndex=word.charAt(0)-'a';
	        TrieNode child=root.children[childIndex];
	        if(child==null){
	            return false;
	        }
	        return searchHelper(child,word.substring(1));
	    }
	    
	    public boolean startsWith(String prefix) {
	        return startsWithHelper(root,prefix);
	    }
	    private boolean startsWithHelper(TrieNode root,String prefix){
	        if(prefix.length()==0){
	            return true;
	        }
	        int childIndex=prefix.charAt(0)-'a';
	        TrieNode child=root.children[childIndex];
	        if(child==null){
	            return false;
	        }
	        return startsWithHelper(child,prefix.substring(1));
	    }
}
