package AllCodes;

import java.util.*;

public class Word_Break {
	public boolean wordBreak(String s, List<String> wordDict) {
        Tries t=new Tries();
        
        for(String word:wordDict)
         t.add(word);
        Map<String,Boolean>mp = new HashMap<>();
        return t.traverse(s,mp);
    }
}
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
class Tries{
    private TrieNode root;
    public Tries(){
        root=new TrieNode('\0');
    }
    
    public void add(String word){
        addHelper(root,word);
    }
    
    private void addHelper(TrieNode root,String word){
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
        addHelper(child,word.substring(1));
    }
    public boolean search(String word){
		return searchHelper(root,word);
	}
	
	private boolean searchHelper(TrieNode root, String word){
        if(word.length()==0){
            if(root.isTerminating==true)
                return true;
            else
                return false;
        }
        int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
        if(child==null){
            return false;
        }
        return searchHelper(child,word.substring(1));
    }
    public boolean traverse(String word, Map<String,Boolean>mp){
		if(word.length()==0 || this.search(word))
            return true;
        
        if(mp.containsKey(word)) 
           return mp.get(word);
        
        for(int i=0;i<word.length();i++){
            if(this.search(word.substring(0 , i))){
                if(traverse(word.substring(i),mp)){
                    mp.put(word.substring(i),true);
                       return true;
                }
            }
        }
        mp.put(word,false);
        return false;
	}
    
}
