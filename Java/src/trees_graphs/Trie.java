package trees_graphs;

import java.util.ArrayList;

public class Trie {
	TrieNode root;
	public Trie(){
		root= new TrieNode('*'); // The first node is dummy
	}
	public void put(int value, String key){
		putRecursive(value,key,root);
	}
	public Integer get(String key){
		return getRecursive(key,root);
	}
	private void putRecursive(int value,String key, TrieNode root){
		if(key.equals("")){
			root.value=value;
		}
		else if(root.hash[key.charAt(0)]!=-1){
			putRecursive(value,key.substring(1),root.links.get(root.hash[key.charAt(0)]));
		}
		else{
			TrieNode n= new TrieNode(key.charAt(0));
			root.links.add(n);
			root.hash[key.charAt(0)]=root.links.size()-1;
			putRecursive(value,key.substring(1),n);
		}
	}
	private Integer getRecursive(String key, TrieNode root){
		if(key.equals("")){
			return root.value;
		}
		else if(root.hash[key.charAt(0)]==-1){
			return null;
		}
		else{
			return getRecursive(key.substring(1),root.links.get(root.hash[key.charAt(0)]));
		}
	}
	class TrieNode{
		public Integer value;
		public char nodeKey;
		public int []hash;
		public ArrayList<TrieNode> links;
		public TrieNode(char nodeKey){
			this.nodeKey=nodeKey;
			hash= new int[128];
			for(int i=0;i<128;i++)
				hash[i]=-1;
			links= new ArrayList<TrieNode>();
		}
	}
}

